package com.example.itadelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BuscarOpcoesViagem : AppCompatActivity() {

    private lateinit var btnFormaPagamento : Button
    private lateinit var btnObjeto : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_opcoes_vaigem)


        btnFormaPagamento = findViewById(R.id.btnFormaPagamento)
        btnObjeto = findViewById(R.id.btnObjeto)


        btnObjeto.setOnClickListener {
            val intent = Intent(this, InformacoesDoObjeto::class.java)
            startActivity(intent)
        }

        btnFormaPagamento.setOnClickListener {
            val intent = Intent(this, FormadePagamento::class.java)
            startActivity(intent)
        }

    }
}