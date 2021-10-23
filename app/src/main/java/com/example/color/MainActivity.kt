package com.example.color

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    private lateinit var cor: TextView
    private lateinit var layout: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ids
        this.cor = findViewById(R.id.tvCor)
        this.layout = findViewById(R.id.layout)

        this.cor.text= Collor().toString()



        //Adicionando a opção de click para que seja alterado a informação e valor da cor gerada
        this.layout.setOnClickListener {
           // Mostra a cor RGB na tela como texto
            this.cor.text= Collor().toString()
            //Convertendo os valores para inteiro
            val view = Collor().toString().replace("[", "").replace("]","").toInt()
            //adiciona a cor a tela
            this.layout.setBackgroundColor(view)
        }

    }
}





