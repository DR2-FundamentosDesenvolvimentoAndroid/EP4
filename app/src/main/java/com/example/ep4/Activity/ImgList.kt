package com.example.ep4.Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ep4.R
import kotlinx.android.synthetic.main.activity_img_list.*

class ImgList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img_list)

        var intt = Intent()

        img1.setOnClickListener{
            var id = R.drawable.android
            intt.putExtra("imagem", id)
            setResult(Activity.RESULT_OK, intt)
            finish()
        }

        img2.setOnClickListener{
            var id = R.drawable.um
            intt.putExtra("imagem", id)
            setResult(Activity.RESULT_OK, intt)
            finish()
        }
    }
}
