package com.nicco.animationsandroid.animation_part8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nicco.animationsandroid.R

class ListAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_animation)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ListDemoFragment.instance(withHeader = false))
            .addToBackStack(null)
            .commit()
    }
}