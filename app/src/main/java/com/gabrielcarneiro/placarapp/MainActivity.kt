package com.gabrielcarneiro.placarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var scoreTime1 = 0
        var scoreTime2 = 0

        scoreTime1TXT.setOnClickListener{
            scoreTime1++
            scoreTime1TXT.text = scoreTime1.toString()
        }


        scoreTime2TXT.setOnClickListener{
            scoreTime2++
            scoreTime2TXT.text = scoreTime2.toString()

        }
    }
}