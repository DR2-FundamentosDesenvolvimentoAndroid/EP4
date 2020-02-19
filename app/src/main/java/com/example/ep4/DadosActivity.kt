package com.example.ep4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dados.*

class DadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        var nome = intent.getStringExtra("nomeDoUsuario")
        var email = intent.getStringExtra("emailDoUsuario")
        var telefone = intent.getStringExtra("telefoneDoUsuario")

        tvNome.text = nome
        tvEmail.text = email
        tvTelefone.text = telefone
    }
}
