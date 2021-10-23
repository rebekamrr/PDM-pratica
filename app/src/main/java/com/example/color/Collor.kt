package com.example.color

import android.graphics.Color
import kotlin.random.Random

class Collor {
    private var coloration: MutableSet <Int>

    constructor(){
        this.coloration= mutableSetOf()
        this.setCor()
    }

    private fun setCor() {
        //Gera valores randomicamente para o rgb
        val Colors= Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        //adiciona as cores geradas
        coloration.add(Colors)
    }

    override fun toString(): String {
        return this.coloration.toString()
    }
}