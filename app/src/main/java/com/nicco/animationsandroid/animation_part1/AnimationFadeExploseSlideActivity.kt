package com.nicco.animationsandroid.animation_part1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.Explode
import androidx.transition.Fade
import androidx.transition.Slide
import androidx.transition.TransitionManager
import com.nicco.animationsandroid.R
import kotlinx.android.synthetic.main.activity_fade_explose_slide.*

class AnimationFadeExploseSlideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fade_explose_slide)

        btnFadeIn.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, Fade())
            if (image.visibility == View.INVISIBLE) {
                image.visibility = View.VISIBLE
            } else {
                image.visibility = View.INVISIBLE
            }
        }

        btnExplose.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, Explode())
            if (image.visibility == View.INVISIBLE) {
                image.visibility = View.VISIBLE
            } else {
                image.visibility = View.INVISIBLE
            }
        }

        btnSlide.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, Slide())
            if (image.visibility == View.INVISIBLE) {
                image.visibility = View.VISIBLE
            } else {
                image.visibility = View.INVISIBLE
            }
        }
    }
}
