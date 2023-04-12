package com.example.front_projeto_paysandu

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.front_projeto_paysandu.screen.Agendamento.AgendamentosActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val descricao = findViewById<View>(R.id.textCPF) as TextView
    }

    fun telaAgendamento(view: View?) {
        val intent = Intent(this, AgendamentosActivity::class.java)
        startActivity(intent)
    }


}