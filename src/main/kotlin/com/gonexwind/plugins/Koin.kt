package com.gonexwind.plugins

import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(org.koin.ktor.plugin.Koin) {
        slf4jLogger()
    }
}