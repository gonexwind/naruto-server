<div align="center">

  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/ktorio/ktor/main/.github/images/ktor-logo-for-dark.svg">
    <img alt="Ktor logo" src="https://raw.githubusercontent.com/ktorio/ktor/main/.github/images/ktor-logo-for-light.svg">
  </picture>

</div>

[![Official JetBrains project](http://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![Maven Central](https://img.shields.io/maven-central/v/io.ktor/ktor)](https://mvnrepository.com/artifact/io.ktor)
[![Kotlin](https://img.shields.io/badge/kotlin-1.6.21-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Slack channel](https://img.shields.io/badge/chat-slack-green.svg?logo=slack)](https://kotlinlang.slack.com/messages/ktor/)
[![GitHub License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)
[![Contribute with Gitpod](https://img.shields.io/badge/Contribute%20with-Gitpod-908a85?logo=gitpod)](https://gitpod.io/#https://github.com/ktorio/ktor)

Ktor is an asynchronous framework for creating microservices, web applications and more. Written in Kotlin from the ground up.

# API Spec

## Get All Heroes
Request:
- Method: GET
- Endpoint: `/naruto/heroes?page=1`
- Header :
    - Accept: application/json
- Response :
```json
{
    "success": true,
    "message": "ok",
    "prevPage": null,
    "nextPage": 2,
    "heroes": [
        {
            "id": 1,
            "name": "Sasuke",
            "image": "/images/sasuke.jpg",
            "about": "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            "rating": 5.0,
            "power": 98,
            "month": "July",
            "day": "23rd",
            "family": [
                "Fugaku"
            ],
            "abilities": [
                "Sharingan"
            ],
            "natureTypes": [
                "Lightning"
            ]
        }
    ]
}
```

## Search Heroes
Request:
- Method: GET
- Endpoint: `/naruto/heroes/search?name=naru`
- Header :
    - Accept: application/json
- Response :
```json
{
    "success": true,
    "message": "ok",
    "prevPage": null,
    "nextPage": null,
    "heroes": [
        {
            "id": 2,
            "name": "Naruto",
            "image": "/images/naruto.jpg",
            "about": "Naruto Uzumaki (うずまきナルト, Uzumaki Naruto) is a shinobi of Konohagakure's Uzumaki clan. He became the jinchūriki of the Nine-Tails on the day of his birth — a fate that caused him to be shunned by most of Konoha throughout his childhood. After joining Team Kakashi, Naruto worked hard to gain the village's acknowledgement all the while chasing his dream to become Hokage.",
            "rating": 5.0,
            "power": 98,
            "month": "Oct",
            "day": "10th",
            "family": [
                "Minato"
            ],
            "abilities": [
                "Rasengan"
            ],
            "natureTypes": [
                "Wind"
            ]
        }
    ]
}
```