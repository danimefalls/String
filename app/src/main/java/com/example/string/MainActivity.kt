package com.example.string

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputText: EditText
    private lateinit var countButton: Button
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.inputText)
        countButton = findViewById(R.id.countButton)
        resultText = findViewById(R.id.resultText)

        countButton.setOnClickListener {
            val input = inputText.text.toString()
            val count = countLatinLetters(input)
            resultText.text = "Количество латинских букв: $count"
        }
    }

    private fun countLatinLetters(text: String): Int {
        return text.count { it.isLetter() && it in 'A'..'Z' || it in 'a'..'z' }
    }
}
