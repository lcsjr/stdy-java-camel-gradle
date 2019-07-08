package br.com.spring.camel.config;

import javax.persistence.EntityManager;

import org.apache.camel.component.jpa.JpaComponent;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EntityScan(basePackages="br.com.spring.model")
public class AppConfig {

	@Bean(name="jpa")
    public JpaComponent jpaComponent(PlatformTransactionManager transactionManager, EntityManager entityManager) {
        JpaComponent component = new JpaComponent();
        component.setTransactionManager(transactionManager);
        component.setEntityManagerFactory(entityManager.getEntityManagerFactory());
        return component;
    }
}
