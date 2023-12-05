package com.example.itadelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GerenciamentoConta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerenciamento_conta)

        val textName: TextView = findViewById(R.id.textName)
        val textPhoneNumber: TextView = findViewById(R.id.textPhoneNumber)
        val textEmail: TextView = findViewById(R.id.textEmail)
        val textPassword: TextView = findViewById(R.id.textPassword)

        // Configuração do clique para o link "Nome"
        textName.setOnClickListener {
            val intent = Intent(this, AtualizarDadosNome::class.java)
            startActivity(intent)
        }

        // Configuração do clique para o link "Número de Telefone"
        textPhoneNumber.setOnClickListener {
            val intent = Intent(this, AtualizarDadosTelefone::class.java)
            startActivity(intent)
        }

        // Configuração do clique para o link "E-mail"
        textEmail.setOnClickListener {
            val intent = Intent(this, AtualizarDadosEmail::class.java)
            startActivity(intent)
        }

        // Configuração do clique para o link "Senha"
        textPassword.setOnClickListener {
            val intent = Intent(this, AtualizarDadosSenha::class.java)
            startActivity(intent)
        }
    }
}