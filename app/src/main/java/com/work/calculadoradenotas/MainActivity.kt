package com.work.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular: = calcular
        val resultado: = resultado

        btCalcular.setOnClickListener {

            val nota1 = integer.parseInt(nota1.text.toString())
            val nota2 = integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val falta = integer.parseInt(falta.text.toString())

            if (media >=6 && falta <=10){
                resultado.setText("ALUNO APROVADO" + "\n" + "NOTA FINAL:" + media+"\n" + "FALTAS:"+falta)
            }
            else {
                resultado.setText("ALUNO REPROVADO" + "\n" + "NOTA FINAL:" + media+"\n" + "FALTAS:"+falta)
            }
        }
    }
}