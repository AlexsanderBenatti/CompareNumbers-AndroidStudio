package com.example.exemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.test_button).setOnClickListener{
            textLength(it)
        }
    }
    private fun textLength(view: View){
        val editNum1 = findViewById<EditText>(R.id.num1)
        val editNum2 = findViewById<EditText>(R.id.num2)
        if (editNum1.text.toString().isEmpty() || editNum2.text.toString().isEmpty()) {
            Toast.makeText(this, "Entrada inválida", Toast.LENGTH_SHORT).show()
        }
        else {
            val num1 = Integer.parseInt(editNum1.text.toString())
            val num2 = Integer.parseInt(editNum2.text.toString())

            if (num1 > num2) {
                Toast.makeText(this, "O de cima é maior", Toast.LENGTH_SHORT).show()
            }
            else if (num1 < num2) {
                Toast.makeText(this, "O de baixo é maior", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Os números são iguais", Toast.LENGTH_SHORT).show()
            }
        }
    }
}