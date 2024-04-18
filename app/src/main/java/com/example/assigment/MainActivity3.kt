package com.example.assigment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    private lateinit var btnArticalBook: Button
    private lateinit var btnVideo: Button
    private lateinit var btnExam: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)


    }

    fun btnArticalBook(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        // intent.putExtra("data",msg);
        startActivity(intent)

    }
    fun btnVideo(view: View) {

    }
    fun btnExam(view: View) {

    }
}