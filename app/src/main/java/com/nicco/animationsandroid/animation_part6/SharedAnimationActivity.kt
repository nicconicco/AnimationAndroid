package com.nicco.animationsandroid.animation_part6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.nicco.animationsandroid.R
import kotlinx.android.synthetic.main.activity_shared_animation.*


class SharedAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_animation)

        btnAnimate.setOnClickListener {
            val detailIntent = Intent(this@SharedAnimationActivity, SequenceAnimationActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this@SharedAnimationActivity,
                image,
                "robot_android"
            )
            startActivity(detailIntent, options.toBundle())
        }
    }
}
