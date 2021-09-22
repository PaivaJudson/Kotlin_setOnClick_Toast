package com.judson.instituto_de_codigo_um

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var nome: EditText
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nome = findViewById(R.id.edt_nome)
        botao = findViewById(R.id.btn_botao)

        botao.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                var str: String = nome.text.toString()
                Toast.makeText(applicationContext, "Olá tudo bem "+str+"?", Toast.LENGTH_LONG).show()
            }
        })
    }
}