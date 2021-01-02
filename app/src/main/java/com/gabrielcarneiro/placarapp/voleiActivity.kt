package com.gabrielcarneiro.placarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_volei.*

class voleiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volei)
        var scoreTime1= 0
        var scoreTime2 =0
        var setScoreTime1 = 0
        var setScoreTime2 = 0
        scoreTime1TXT.setOnClickListener {
            scoreTime1++

            scoreTime1TXT.text = scoreTime1.toString()
            if(scoreTime1 % 15 == 0){

                setScoreTime1++
                setScoreTime1TXT.text = setScoreTime1.toString()

                scoreTime1 = 0
                scoreTime1TXT.text = scoreTime1.toString()

                scoreTime2 = 0
                scoreTime2TXT.text = scoreTime2.toString()

            }






        }


        scoreTime2TXT.setOnClickListener {
            scoreTime2++
            scoreTime2TXT.text = scoreTime2.toString()

            if(scoreTime2 == 15){

                setScoreTime2++
                setScoreTime2TXT.text = setScoreTime2.toString()

                scoreTime1 = 0
                scoreTime1TXT.text = scoreTime1.toString()

                scoreTime2 = 0
                scoreTime2TXT.text = scoreTime2.toString()
            }


        }






    }
}