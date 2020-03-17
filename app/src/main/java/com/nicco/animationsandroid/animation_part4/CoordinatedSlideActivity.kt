package com.nicco.animationsandroid.animation_part4

import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.Slide
import androidx.transition.TransitionManager
import com.nicco.animationsandroid.R
import kotlinx.android.synthetic.main.activity_coordinated_slide.*

class CoordinatedSlideActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        for (i in 0 until root.childCount) {
            val view: View = root.getChildAt(i)
            view.postDelayed(Runnable {
                TransitionManager.beginDelayedTransition(root, Slide(Gravity.TOP))
                view.visibility = if (view.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            }, 300L * i)
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinated_slide)
        setSupportActionBar(toolbar)
    }
}
