package com.example.locker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Escolha_porta_par : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_escolha_porta_par)
        setListner()
        setListner_04()
        setListner_06() 
    }

    @SuppressLint("WrongViewCast")
    fun setListner(){
        val btn2 = findViewById<Button>(R.id.botao_2)
        btn2.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_04(){
        val btn4 = findViewById<Button>(R.id.botao_4)
        btn4.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_06(){
        val btn6 = findViewById<Button>(R.id.botao_6)
        btn6.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}