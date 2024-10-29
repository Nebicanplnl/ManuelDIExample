package com.example.dinjexample.DependencyInjectıon

//Manuel DI

interface Engine3 {
    fun start()
}

class GasEngine: Engine3 {
    override fun start() {
        println("Gas engine started")
    }
}

class DieselEngine: Engine3 {
    override fun start() {
        println("Diesel engine started")
    }
}

class HybridEngine: Engine3 {
    override fun start() {
        println("Hybrid engine started")
    }
}
//Constructor injection
class Car3(private val engine: Engine3) {
    fun start() {
        engine.start()
    }
}
//Field İnjection
class CarPlane() {

    private lateinit var engine: Engine3

    fun setEngine(engine: Engine3) {
        this.engine = engine
    }

    fun start() {
        engine.start()
    }
}

fun main() {
    val plane3 = CarPlane()
    plane3.setEngine(GasEngine())
    plane3.start()


}





