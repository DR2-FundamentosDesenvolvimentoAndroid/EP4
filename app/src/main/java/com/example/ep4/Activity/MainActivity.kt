package com.example.ep4.Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ep4.Model.Usuario
import com.example.ep4.R
import kotlinx.android.synthetic.main.activity_main.*
import java.io.StringReader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgGeneric.setOnClickListener{
            var imgListPage = Intent(this, ImgList::class.java)
            startActivityForResult(imgListPage, 2)
        }

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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK){
            when(requestCode){
                1 -> {
                    var retorno = data!!.getStringExtra("resultado")
                }
                2 ->{
                    var img = data!!.getIntExtra("imagem", R.drawable.img)
                    imgGeneric.setImageResource(img)
                }
            }
        }

    }

}
