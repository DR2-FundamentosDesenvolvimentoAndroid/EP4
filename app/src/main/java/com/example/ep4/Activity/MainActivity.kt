package com.example.ep4.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ep4.Model.Usuario
import com.example.ep4.R
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
            var usuario = Usuario(editTxtNome.text.toString(),editTxtEmail.text.toString(),editTxtTelefone.text.toString())

            intt.putExtra("usuario", usuario)
//            startActivity(intt)

            startActivityForResult(intt, 1)

        }
    }

}
