package com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.model.Player
//import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_PLAYER
//import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var palyer = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueTxt.text = "Looking for ${palyer.league} ${palyer.skill} league near you..."
    }
}
