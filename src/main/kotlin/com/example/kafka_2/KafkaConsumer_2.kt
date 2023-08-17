package com.example.kafka_2

import com.example.kafka_2.POJO.User
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component


@Component
class KafkaConsumer_2 {
    @KafkaListener(topics = ["quickstart-events"], groupId = "group-id")
    fun consume(message: String) {
        try {
//
            val objectMapper = ObjectMapper()
            val user: User = objectMapper.readValue(message, User::class.java)
            println(user.id)
            println(user.name)
            println(user.address)

        } catch (e: Exception) {
            e.printStackTrace()
        }
        println("Received message:${message}")
    }
}