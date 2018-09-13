package com.vsoft.trackify

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FaceTrackRestApplication : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Application started running")
    }
}

fun main(args: Array<String>) {
    runApplication<FaceTrackRestApplication>(*args)
}
