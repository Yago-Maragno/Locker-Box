package com.example.locker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Escolha_lado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_escolha_lado)

        setListner()
        setListner_par()
    }
    @SuppressLint("WrongViewCast")
    fun setListner(){
        val btnImpar = findViewById<Button>(R.id.bt_impar)
        btnImpar.setOnClickListener {
            val intent = Intent(this,Escolha_porta_impar::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_par(){
        val btnPar = findViewById<Button>(R.id.bt_par)
        btnPar.setOnClickListener {
            val intent = Intent(this,Escolha_porta_par::class.java)
            startActivity(intent)
            finish()
        }
    }
}