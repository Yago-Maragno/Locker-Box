package com.example.locker

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import com.example.locker.databinding.ActivityCadastroBinding

class Cadastro : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_cadastro)

        setListner()
    }
    @SuppressLint("WrongViewCast")
    fun setListner(){
        val btnCadastro = findViewById<Button>(R.id.bt_cadastrar)

        btnCadastro.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
    }

}