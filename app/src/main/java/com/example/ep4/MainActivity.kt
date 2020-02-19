package com.example.ep4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConfirmar.setOnClickListener{
            Toast.makeText(
                this,
                "Dados enviados\n" +
                        "Nome: ${editTxtNome.text}\n" +
                        "E-Mail: ${editTxtEmail.text}\n" +
                        "Telefone: ${editTxtTelefone.text}",
                Toast.LENGTH_SHORT
            ).show()

            var intt = Intent(this, DadosActivity::class.java)
            intt.putExtra("nomeDoUsuario", editTxtNome.text.toString())
            intt.putExtra("emailDoUsuario", editTxtEmail.text.toString())
            intt.putExtra("telefoneDoUsuario", editTxtTelefone.text.toString())
            startActivity(intt)



        }
    }

}
