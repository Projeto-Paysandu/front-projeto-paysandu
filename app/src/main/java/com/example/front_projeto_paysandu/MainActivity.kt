package com.example.front_projeto_paysandu

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.front_projeto_paysandu.screen.Agendamento.AgendamentosActivity


class MainActivity : AppCompatActivity() {
    private var cpf: EditText? = null
    private var password: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cpf = findViewById<View>(R.id.editNumberCPF) as EditText
        password = findViewById<View>(R.id.editTextPassword) as EditText
    }

    fun telaAgendamento(view: View?) {
        Log.i("cpf", cpf?.text.toString())
        if(cpf?.text.toString() == "10894476475" && password?.text.toString() == "123456") {
            val intent = Intent(this, AgendamentosActivity::class.java)
            startActivity(intent)
        }
    }
}