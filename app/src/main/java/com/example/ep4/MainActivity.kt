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
                        "Nome: ${editTxtNome.text.toString()}\n" +
                        "E-Mail: ${editTxtEmail.text.toString()}\n" +
                        "Telefone: ${editTxtTelefone.text.toString()}",
                Toast.LENGTH_SHORT
            ).show()

            var intt = Intent(this, DadosActivity::class.java)
            startActivity(intt)



        }
    }

}
