package com.nicco.animationsandroid.animation_part3

import android.os.Bundle
import android.transition.Explode
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.nicco.animationsandroid.R
import kotlinx.android.synthetic.main.activity_animation_scene_one_two.*


class BackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back)

        btnBackScene.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)
        }
    }
}
