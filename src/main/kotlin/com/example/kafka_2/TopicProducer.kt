package com.example.kafka_2

import com.example.kafka_2.POJO.User
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class TopicProducer(val kafkaTemplate: KafkaTemplate<String, String>) {
//
//    @Value("\${topic.name.producer}")
//    lateinit var topicName: String;
//
//    fun send(message: User) {
//        println(message)
//        kafkaTemplate.send(topicName, message.toString())
//    }
}