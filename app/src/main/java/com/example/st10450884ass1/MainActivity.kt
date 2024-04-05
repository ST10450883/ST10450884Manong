package com.example.st10450884ass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clearButton = findViewById<Button>(R.id.clearButton)
        val compareButton=findViewById<Button>(R.id.compareButton)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        compareButton.setOnClickListener {
            val userInput = ageEditText.text.toString()
            if (userInput.isEmpty()) {
                resultTextView.text = "Please enter a valid age – it must be a whole " +
                        "number without any decimals or text."
            }
            val userAge = userInput.toIntOrNull()
            if (userAge == null) {
                resultTextView.text = "Please enter a valid age – it must be a whole number " +
                        "without any decimals or text."
            } else {
                if (userAge < 20 || userAge > 100) {
                    resultTextView.text = "Please enter an age between 20 and 100."
                    ageEditText.text.clear()
                } else {
                    val result = when (userAge) {
                        96 -> "Queen Elizabeth II was famous because of the reigning British monarch; she has been the longest-reigning monarch since " +
                                "ascended to the throne in 1952 surpassing Queen Victoria's record in 2015."

                        78 -> "Mahatma Gandi was famous for his nonviolent resistance. He is renowned influential leader known for his philosophy of nonviolent " +
                                "resistance played a pivotal role in India's independence movement against British rule."

                        32 -> "Alexander the Great was famous for his military tactics and strategy. He was a brilliant military strategist, he utilized innovative tactics" +
                                " and combined arms warfare including infantry, cavalry, and siege engines to defeat numerically superior forces."

                        27 -> "Cobain was famous for his iconic status and was renowned for his distinctive voice, raw songwriting, and dynamic stage presence, became a grunge" +
                                " era icon and an icon of alternative culture."

                        20 -> "Evariste Galois was famous for his theory Galois theory, at a young age he developed Galois theory providing a profound understanding of algebraic " +
                                "equations and the structure of field extensions. "

                        43 -> "Zoleka Mandela was famous for her prominent advocate for road safety, she has been instrumental in reducing road accidents in South Africa highlighting " +
                                "the urgent need for improved safety measures."

                        56 -> "Adolf Hitler was famous for creating World War II his expansionist policies including invasion of Poland in 1939, led to World War II causing widespread destruction, " +
                                "loss of life, and suffering across Europe."

                        87 -> "Mother Terese was famous for founding the missionaries of charity, she founded Missionaries of Charity in 1950, a Roman Catholic religious congregation dedicated to serving " +
                                "the \"poorest of the poor\" through various missions and charitable activities"

                        60 -> "Diego Maradona was famous for his 186 FIFA World Cup, during the 1986 FIFA World Cup, Maradona's legendary performances including his \"Hand of God\" goal were instrumental" +
                                " in Argentina's victory against England."

                        59 -> "George Best was famous for his charisma and personality, he was a popular figure with a charismatic personality, Best's attractive looks and charm have made him a popular" +
                                " figure both on and off the field"

                        else -> "Nobody known to me died at this age"
                    }
                    resultTextView.text = result

                }

            }

        }

        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }
}

