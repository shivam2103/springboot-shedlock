package com.shedlock.example.config

import net.javacrumbs.shedlock.core.LockProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider
import javax.sql.DataSource
@Configuration
class LockProviderConfig {

    @Bean
    fun lockProvider(dataSource: DataSource): LockProvider? {
        return JdbcTemplateLockProvider(dataSource)
    }
}