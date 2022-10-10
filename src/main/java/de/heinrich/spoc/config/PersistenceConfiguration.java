package de.heinrich.spoc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class PersistenceConfiguration {
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(dbUrl);
        return builder.build();
    }
}
