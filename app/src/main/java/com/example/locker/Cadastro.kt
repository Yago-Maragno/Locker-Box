package com.example.locker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_cadastro)
    }
}