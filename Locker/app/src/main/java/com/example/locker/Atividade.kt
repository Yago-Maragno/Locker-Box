package com.example.locker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Atividade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_atividade)
        setListner()
        setListner_abrir()
    }

    @SuppressLint("WrongViewCast")
    fun setListner(){
        val btnReservar = findViewById<Button>(R.id.bt_reservar)
        btnReservar.setOnClickListener {
            val intent = Intent(this,Escolha_locker::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_abrir(){
        val btnCadastro = findViewById<Button>(R.id.bt_abrir)

        btnCadastro.setOnClickListener {
            val intent = Intent(this,Abrir::class.java)
            startActivity(intent)
            finish()
        }
    }
}