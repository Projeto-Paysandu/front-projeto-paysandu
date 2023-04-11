package com.example.front_projeto_paysandu.screen.Agendamento

import android.content.Intent
import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity
import com.example.front_projeto_paysandu.R
import com.example.front_projeto_paysandu.screen.Agendamento.MeusAgendamentos.MeusAgendamentosActivity
import com.example.front_projeto_paysandu.screen.Agendamento.NovoAgendamento.NovoAgendamentoActivity

class AgendamentosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendamentos)
    }

    fun telaNovoAgendamento(view: View?) {
        val intent = Intent(this, NovoAgendamentoActivity::class.java)
        startActivity(intent)
    }

    fun telaMeusAgendamentos(view: View?) {
        val intent = Intent(this, MeusAgendamentosActivity::class.java)
        startActivity(intent)
    }
}