package com.ain.syl.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 
 * @since 2015.11.11
 * @author 박영규
 *
 */

@Configuration
@EnableConfigurationProperties
public class DatasourceProperties {

    @Bean(name = "consoleAdminDataSource")
    @Qualifier("consoleAdminDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource consoleAdminDataSource() { return DataSourceBuilder.create().build(); }

    @Bean(name = "consoleCsosDataSource")
    @Qualifier("consoleCsosDataSource")
    @ConfigurationProperties(prefix="spring.datasource.csos")
    public DataSource consoleCsosDataSource() { return DataSourceBuilder.create().build(); }
}