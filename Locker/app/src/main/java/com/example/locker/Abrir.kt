package com.example.locker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Abrir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abrir)
        setListner()
    }
    @SuppressLint("WrongViewCast")
    fun setListner(){
        val btnAbrir = findViewById<Button>(R.id.confirm_abrir)
        btnAbrir.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}