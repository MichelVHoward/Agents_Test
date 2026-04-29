package com.howard.agent_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform