package com.example.locker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Escolha_locker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_escolha_locker)
    }
}