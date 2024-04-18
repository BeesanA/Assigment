package com.example.assigment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity2 : AppCompatActivity() {

    private lateinit var spinner: Spinner
    private lateinit var text: TextView
    private lateinit var btnnext: Button
  //  private lateinit var txtShowMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        //txtShowMessage = findViewById(R.id.txtShowMessage)
        val msg = intent.getStringExtra("data")
        //txtShowMessage.text = msg
        spinner =findViewById(R.id.spinner)
        btnnext=findViewById(R.id.btnnext)

    }

    fun btnnext(view: View) {
        val intent = Intent(this, MainActivity3::class.java)
        // intent.putExtra("data",msg);
        startActivity(intent)
    }


}