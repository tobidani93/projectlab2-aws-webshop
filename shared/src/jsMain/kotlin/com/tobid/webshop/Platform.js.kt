package com.tobid.webshop

class JsPlatform : Platform {
    override val name: String = "Web with Kotlin/JS"
}

actual fun getPlatform(): Platform = JsPlatform()