package com.example.locker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Escolha_porta_impar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_escolha_porta_impar)
        setListner()
        setListner_03()
        setListner_05()
    }

    @SuppressLint("WrongViewCast")
    fun setListner(){
        val btn1 = findViewById<Button>(R.id.botao_1)
        btn1.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_03(){
        val btn3 = findViewById<Button>(R.id.botao_3)
        btn3.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_05(){
        val btn5 = findViewById<Button>(R.id.botao_5)
        btn5.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}