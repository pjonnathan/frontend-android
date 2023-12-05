package com.example.itadelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormadePagamento : AppCompatActivity() {

    private lateinit var btnAdicionarCartao: Button
    private lateinit var btnDesvincularCartao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formade_pagamento)

        btnAdicionarCartao = findViewById(R.id.btnAdicionarCartao)
        btnDesvincularCartao = findViewById(R.id.btnDesvincularCartao)

        btnAdicionarCartao.setOnClickListener {
            val intent = Intent(this, VincularCartao::class.java)
            startActivity(intent)
        }
        btnDesvincularCartao.setOnClickListener {
            val intent = Intent(this, DesvincularCartao::class.java)
            startActivity(intent)
        }
    }
}