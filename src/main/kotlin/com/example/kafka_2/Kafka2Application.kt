package com.example.kafka_2

import com.fasterxml.jackson.databind.JsonSerializable
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@EnableKafka
@SpringBootApplication
class Kafka2Application

fun main(args: Array<String>) {
	runApplication<Kafka2Application>(*args)
}
