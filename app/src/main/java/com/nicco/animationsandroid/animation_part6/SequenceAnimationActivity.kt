package com.nicco.animationsandroid.animation_part6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nicco.animationsandroid.R
import kotlinx.android.synthetic.main.activity_sequence_animation.*

class SequenceAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sequence_animation)

        btnAnimate.setOnClickListener {
            finish()
        }
    }
}
