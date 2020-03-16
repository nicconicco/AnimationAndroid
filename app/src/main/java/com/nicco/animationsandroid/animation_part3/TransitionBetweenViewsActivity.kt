package com.nicco.animationsandroid.animation_part3

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nicco.animationsandroid.R
import kotlinx.android.synthetic.main.activity_transition_between_views.*

class TransitionBetweenViewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_between_views)

        btn.setOnClickListener {
           val bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle()
            val intent = Intent(this, BackActivity::class.java)
            startActivity(intent, bundle)
        }
    }
}
