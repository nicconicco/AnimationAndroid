package com.nicco.animationsandroid.animation_part5

import android.graphics.Rect
import android.os.Bundle
import com.nicco.animationsandroid.R
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.*
import kotlinx.android.synthetic.main.activity_change_animation.*

class ChangeAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_animation)

        val transitionSet = TransitionSet()
//        transitionSet.addTransition(ChangeTransform())
        transitionSet.addTransition(ChangeImageTransform())
//        transitionSet.addTransition(ChangeClipBounds())

        btnAnimate.setOnClickListener {
            TransitionManager.beginDelayedTransition(
                root,
                transitionSet
            )
//            image.scaleX = 1.5f
//            image.scaleY = 1.0f
//            image.rotation = 30F
            image.scaleType = ImageView.ScaleType.CENTER
            //image.clipBounds = Rect(0, 0, 300, 400)
        }
    }
}
