package com.example.ep4.Activity

import android.app.Activity
import android.app.IntentService
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ep4.Model.Usuario
import com.example.ep4.R
import kotlinx.android.synthetic.main.activity_dados.*

class DadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)


        var usuario = intent.getSerializableExtra("usuario") as Usuario

        tvNome.text = if(usuario.nome.isEmpty()) "Nome do Usuario" else usuario.nome
        tvEmail.text = if(usuario.email.isEmpty()) "E-mail do Usuario" else usuario.email
        tvTelefone.text = if(usuario.telefone.isEmpty()) "Telefone do Usuario" else usuario.telefone

        var intentResult = Intent()
        intentResult.putExtra("resultado", "cadastrado com Sucesso!")

        setResult(Activity.RESULT_OK, intentResult)


        btnVoltar.setOnClickListener{
            finish()
        }
//        finish()
    }
}
