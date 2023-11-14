package com.example.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        ///////////////////////////////////
        val rcvIntent = intent
        val title = rcvIntent.getStringExtra("title")
        textViewTitle.text = title

        val recipe = rcvIntent.getIntExtra("recipe",0)
        textViewDetail.setText(recipe)

        val imageId = rcvIntent.getIntExtra("image",0)
        imageView.setImageResource(imageId)

    }
}