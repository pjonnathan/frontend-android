package com.example.itadelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OrigemDestino : AppCompatActivity() {

    private lateinit var buttonConfirmarViagem : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_origem_destino)

        buttonConfirmarViagem = findViewById(R.id.buttonConfirmarViagem)

        buttonConfirmarViagem.setOnClickListener {
            val intent = Intent(this, BuscarOpcoesViagem::class.java)
            startActivity(intent)
        }

    }
}