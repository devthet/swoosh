package com.example.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
//import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_PLAYER
//import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    //var league =""
    //var skill = ""
   // var player = Player("","")
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
      //  league = intent.getStringExtra(EXTRA_PLAYER)
      player =   intent.getParcelableExtra(EXTRA_PLAYER)
       // println(league)
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }
    fun onSkillFinishClicked(view: View){
        if(player.skill != ""){
            var finishActivity = Intent(this,FinishActivity::class.java)
//            finishActivity.putExtra(EXTRA_LEAGUE,league)
//            finishActivity.putExtra(EXTRA_SKILL,skill)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }

    }
}
