package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {


    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null)
        {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }
    fun leagueNextClick( view:View){
        if(player.league !=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }

    }

    fun mensonClicked(view: View){
        womansLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "Mens"
    }

    fun womansonClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "Womens"
    }
    fun coedonClicked(view: View){
        mensLeagueBtn.isChecked = false
        womansLeagueBtn.isChecked = false
        player.league = "CO-ED"
    }
}
