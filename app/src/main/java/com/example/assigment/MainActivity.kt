package com.example.assigment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtmessage: EditText

    private lateinit var edtname: EditText
    private lateinit var edtpassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        edtname = findViewById(R.id.edtname)
        edtpassword=findViewById(R.id.edtpassword)
        txtmessage=findViewById(R.id.edtname)
    }

    fun btnonclick(view: View) {
       // val msg = txtmessage.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
       // intent.putExtra("data",msg);
        startActivity(intent)



    }


}