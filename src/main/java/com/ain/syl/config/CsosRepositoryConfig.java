package com.ain.syl.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;


/**
 * 
 * @since 2015.11.11
 * @author 박영규
 *
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryCsos",
        transactionManagerRef = "transactionManagerCsos",
        basePackages = { "com.kdn.ecsi.console.repository.csos" }
)
public class CsosRepositoryConfig {
    @Inject
    private JpaVendorAdapter jpaVendorAdapter;

    @Inject
    private JpaProperties jpaProperties;

    @Inject
    @Qualifier("consoleCsosDataSource")
    private DataSource consoleCsosDataSource;

    @Bean(name = "entityManagerCsos")
    public EntityManager entityManagerCsos(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryCsos(builder).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryCsos")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryCsos(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(consoleCsosDataSource)
                .properties(getVendorProperties(consoleCsosDataSource))
                .packages("com.kdn.ecsi.console.domain.csos")
                .persistenceUnit("csosPersistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        jpaProperties.getHibernateProperties(dataSource).forEach((k,v) -> {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("key => " + k + " value => " + v);

        });
        return jpaProperties.getHibernateProperties(dataSource);
    }

    @Bean(name = "transactionManagerCsos")
    PlatformTransactionManager transactionManagerCsos(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryCsos(builder).getObject());
    }
}
