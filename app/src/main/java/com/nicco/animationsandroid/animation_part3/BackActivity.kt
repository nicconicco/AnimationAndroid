package com.nicco.animationsandroid.animation_part3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nicco.animationsandroid.R
import com.nicco.animationsandroid.animation_part9.EXTRA_NETFLIX_IMAGE_TRANSITION
import kotlinx.android.synthetic.main.activity_animation_scene_one_two.*


class BackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back)
        checkExtras()

        btnBackScene.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)
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
