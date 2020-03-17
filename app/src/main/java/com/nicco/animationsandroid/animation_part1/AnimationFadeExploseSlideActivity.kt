package com.nicco.animationsandroid.animation_part1

import android.os.Bundle
import android.view.Gravity
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
            setStateImage()
        }

        btnExplose.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, Explode())
            setStateImage()
        }

        btnSlide.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, Slide())
            setStateImage()
        }

        btnSlideOtherWay.setOnClickListener {
            /**
             *    TransitionManager.beginDelayedTransition(root, Slide(Gravity.TOP))
             *    TransitionManager.beginDelayedTransition(root, Slide(Gravity.BOTTOM))
             *    TransitionManager.beginDelayedTransition(root, Slide(Gravity.START))
             */

            TransitionManager.beginDelayedTransition(root, Slide(Gravity.END))
            setStateImage()
        }
    }

    private fun setStateImage() {
        image.visibility =
            if (image.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
    }
}
