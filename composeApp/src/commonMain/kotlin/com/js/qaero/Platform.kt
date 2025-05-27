package com.js.qaero

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform