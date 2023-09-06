package com.example.locker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Escolha_locker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_escolha_locker)
        setListner()
        setListner_02()
        setListner_03()
        setListner_04()
        setListner_05()
        setListner_06()
        setListner_07()
        setListner_08()

    }
    @SuppressLint("WrongViewCast")
    fun setListner(){
        val btn1 = findViewById<Button>(R.id.escolha_botao01)
        btn1.setOnClickListener {
            val intent = Intent(this,Escolha_lado::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_02(){
        val btn2 = findViewById<Button>(R.id.escolha_botao02)
        btn2.setOnClickListener {
            val intent = Intent(this,Escolha_lado::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_03(){
        val btn3 = findViewById<Button>(R.id.escolha_botao03)
        btn3.setOnClickListener {
            val intent = Intent(this,Escolha_lado::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_04(){
        val btn4 = findViewById<Button>(R.id.escolha_botao04)
        btn4.setOnClickListener {
            val intent = Intent(this,Escolha_lado::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_05(){
        val btn5 = findViewById<Button>(R.id.escolha_botao05)
        btn5.setOnClickListener {
            val intent = Intent(this,Escolha_lado::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_06(){
        val btn6 = findViewById<Button>(R.id.escolha_botao06)
        btn6.setOnClickListener {
            val intent = Intent(this,Escolha_lado::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_07(){
        val btn7 = findViewById<Button>(R.id.escolha_botao07)
        btn7.setOnClickListener {
            val intent = Intent(this,Escolha_lado::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun setListner_08(){
        val btn8 = findViewById<Button>(R.id.escolha_botao08)
        btn8.setOnClickListener {
            val intent = Intent(this,Escolha_lado::class.java)
            startActivity(intent)
            finish()
        }
    }
}