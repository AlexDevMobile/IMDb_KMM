package com.alexdevmobile.imdb

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform