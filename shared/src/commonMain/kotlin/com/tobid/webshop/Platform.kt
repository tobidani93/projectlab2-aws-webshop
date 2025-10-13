package com.tobid.webshop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform