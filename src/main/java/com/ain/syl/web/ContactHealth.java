package com.ain.syl.web;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ain.syl.service.ContactService;

@Component
public class ContactHealth extends AbstractHealthIndicator {
    @Inject
    private DataSource dataSource;
    
    @Inject
    private JdbcTemplate jdbcTemplate;
    
    @Inject
    private ContactService contactService;
    
    @Override
    protected void doHealthCheck(Builder builder) throws Exception {
        if (this.dataSource == null) {
            builder.down().withDetail("DB Driver", "Not available");
            return;
        }
        
        try {
            String dbDriver = jdbcTemplate.execute((Connection conn) -> conn.getMetaData().getDriverName());
            builder.up().withDetail("DB Driver", dbDriver);
            
            int count = jdbcTemplate.execute((Statement stm) -> {
                ResultSet rs = stm.executeQuery("select count(*) from CONTACTS");
                if (rs.next()) {
                    return rs.getInt(1);
                }
                return -1;
            });
            builder.withDetail("Contact Count", count);
        } catch (DataAccessException ex) {
            builder.down(ex);
        }
    }

}
