package com.example.locker

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login)
        setListner()
        setListner_cadastro()
    }

    @SuppressLint("WrongViewCast")
    fun setListner(){
        val btnLogin = findViewById<Button>(R.id.bt_login)

        btnLogin.setOnClickListener {
            val intent = Intent(this,Atividade::class.java)
            startActivity(intent)
            finish()
        }
    }
        fun setListner_cadastro(){
            val btnCadastraSe = findViewById<Button>(R.id.bt_cadastra_se)

            btnCadastraSe.setOnClickListener {
                val intent = Intent(this, Cadastro::class.java)
                startActivity(intent)
                finish()
            }
        }

}