package com.stmik.roninews

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.bumptech.glide.Glide

class DetailBuku() : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_buku)
       val img :ImageView = findViewById(R.id.imageView)
        val judul : TextView = findViewById(R.id.textJudul)
        val decs : TextView = findViewById(R.id.textDetail)

//        val objRecv = Intent.getParcelableExtra(EXTRA_NAME, Book::class.java)
        val objRecv = intent.getParcelableExtra<Book>("extra_name")

        Glide.with(this).load(objRecv?.photo).into(img)

        judul.text = objRecv?.name.toString()
        decs.text = objRecv?.description.toString()
    }

    companion object {
        val EXTRA_NAME: String = "extra_name"
    }
}