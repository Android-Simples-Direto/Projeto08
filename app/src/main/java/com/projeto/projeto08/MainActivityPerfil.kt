package com.projeto.projeto08

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivityPerfil : AppCompatActivity() {

    private lateinit var btnDetalhes: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_perfil)

        btnDetalhes = findViewById(R.id.imgPerfilSidnei)

        btnDetalhes.setOnClickListener {

            val perfil01 = Intent(this, MainActivityDetalhes::class.java)

            startActivity(perfil01)
        }
    }
}