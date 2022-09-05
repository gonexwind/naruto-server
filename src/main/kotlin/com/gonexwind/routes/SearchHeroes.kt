package com.gonexwind.routes

import com.gonexwind.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {

    val heroRepository: HeroRepository by inject()

    get("/naruto/heroes/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = heroRepository.searchHeroes(name!!)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}