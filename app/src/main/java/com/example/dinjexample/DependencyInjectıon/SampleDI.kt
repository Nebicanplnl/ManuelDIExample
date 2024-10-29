package com.example.dinjexample.DependencyInjectıon

class Engine {
    fun start() {
        println("Engine started")
    }
}

class Car() {
   private val engine: Engine = Engine()

    fun start() {
        engine.start()
    }
}

fun main() {
    val car = Car()
    car.start()
}