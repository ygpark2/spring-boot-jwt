
package com.ain.syl.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;


/**
 * 
 * 
 * @since 2015.11.11
 * @author 박영규
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryAdmin",
        transactionManagerRef = "transactionManagerAdmin",
        basePackages = { "com.kdn.ecsi.console.repository.admin" }
)
public class AdminRepositoryConfig {
    @Inject
    private JpaProperties jpaProperties;

    @Inject
    @Qualifier("consoleAdminDataSource")
    private DataSource consoleAdminDataSource;

    @Value("${spring.datasource.hibernate.hbm2ddl.auto}")
    private String ddlauto;

    @Bean(name = "entityManagerAdmin")
    @Primary
    public EntityManager entityManagerAdmin(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryAdmin(builder).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryAdmin")
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryAdmin (EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(consoleAdminDataSource)
                .properties(getVendorProperties(consoleAdminDataSource))
                .packages("com.kdn.ecsi.console.domain.admin")
                .persistenceUnit("adminPersistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        Map<String, String> hibernateProperties = jpaProperties.getHibernateProperties(dataSource);
        hibernateProperties.merge("hibernate.hbm2ddl.auto", ddlauto, (k,v)->v);
        return hibernateProperties;
    }

    @Bean(name = "transactionManagerAdmin")
    @Primary
    PlatformTransactionManager transactionManagerAdmin(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryAdmin(builder).getObject());
    }
}