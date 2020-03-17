package com.nicco.animationsandroid.animation_part6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nicco.animationsandroid.R
import com.nicco.animationsandroid.animation_part9.EXTRA_NETFLIX_IMAGE_TRANSITION
import kotlinx.android.synthetic.main.activity_animation_scene_one_two.*
import kotlinx.android.synthetic.main.activity_sequence_animation.*
import kotlinx.android.synthetic.main.activity_sequence_animation.image

class SequenceAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sequence_animation)
        checkExtras()
        btnAnimate.setOnClickListener {
            finish()
        }
    }

    private fun checkExtras() {
        val extras = intent.extras
        extras?.let {
            val imageTransitionName: String? =
                extras.getString(EXTRA_NETFLIX_IMAGE_TRANSITION)
            image.transitionName = imageTransitionName
        }
    }
}
