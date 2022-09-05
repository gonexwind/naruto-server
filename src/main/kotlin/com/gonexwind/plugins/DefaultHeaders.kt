package com.gonexwind.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import java.time.Duration

fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val yearInSeconds = Duration.ofDays(365).seconds
        header(
            HttpHeaders.CacheControl,
            "public, max-age=$yearInSeconds, immutable"
        ) // will send this header with each response
    }
}