package com.gabrielcarneiro.placarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_volei.*

class voleiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volei)
        var scoreTime1= 0
        var scoreTime2 =0
        var setScoreTime1 = 0
        var setScoreTime2 = 0
        val nomeTime1 = time1TXT.text
        val nomeTime2 = time2TXT.text
        var endGame = false

        fun verificarFimDeJogo(){
            if(setScoreTime1 == 3){
                Toast.makeText(this, "${nomeTime1} VENCEU A PARTIDA por ${setScoreTime1} a ${setScoreTime2}!", Toast.LENGTH_LONG ).show()
                endGame = true

            } else if(setScoreTime2 == 3){

                Toast.makeText(this, "${nomeTime2} VENCEU A PARTIDA por ${setScoreTime2} a ${setScoreTime1}!", Toast.LENGTH_LONG ).show()
                endGame = true
            }
        }
        fun zerarPlacar(){
            scoreTime1 = 0
            scoreTime1TXT.text = scoreTime1.toString()

            scoreTime2 = 0
            scoreTime2TXT.text = scoreTime2.toString()
        }

        fun verificarFimDoSet(){
            if (scoreTime1 >=25 || scoreTime2 >= 25) {
                if (scoreTime1 - scoreTime2 >= 2) {

                    setScoreTime1++
                    setScoreTime1TXT.text = setScoreTime1.toString()

                   zerarPlacar()
                    verificarFimDeJogo()
                }
                if (scoreTime2 - scoreTime1 >= 2) {

                    setScoreTime2++
                    setScoreTime2TXT.text = setScoreTime2.toString()

                    zerarPlacar()
                    verificarFimDeJogo()
                }

            }

        }



            scoreTime1TXT.setOnClickListener {
                if(!endGame) {
                    scoreTime1++

                    scoreTime1TXT.text = scoreTime1.toString()

                    service1IMG.visibility = VISIBLE
                    service2IMG.visibility = GONE

                    verificarFimDoSet()
                }

            }


            scoreTime2TXT.setOnClickListener {
                if(!endGame) {
                    scoreTime2++
                    scoreTime2TXT.text = scoreTime2.toString()



                    service2IMG.visibility = VISIBLE
                    service1IMG.visibility = GONE
                    verificarFimDoSet()
                }
            }






    }
}