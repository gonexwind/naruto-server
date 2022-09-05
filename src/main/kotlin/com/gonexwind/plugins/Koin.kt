package com.gonexwind.plugins

import com.gonexwind.di.koinModule
import io.ktor.server.application.*
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(org.koin.ktor.plugin.Koin) {
        slf4jLogger()
        modules(koinModule)
    }
}