package com.gonexwind.plugins

import com.gonexwind.routes.getAllHeroes
import com.gonexwind.routes.root
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()

        static("/images") {
            resources("images")
        }
    }
}
