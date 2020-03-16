package com.nicco.animationsandroid.animation_part2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.Scene
import androidx.transition.Transition
import androidx.transition.TransitionInflater
import androidx.transition.TransitionManager
import com.nicco.animationsandroid.R
import kotlinx.android.synthetic.main.activity_animation_scene_one.*

class AnimationScene1Activity : AppCompatActivity() {
    lateinit var scene: Scene
    lateinit var nextScene: Scene
    var startAnimation = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_scene_one)

        scene = Scene.getSceneForLayout(root, R.layout.activity_animation_scene_one, this)
        nextScene = Scene.getSceneForLayout(root, R.layout.activity_animation_scene_one_two, this)
    }

    fun changeScene(view: View) {
        val transition : Transition = TransitionInflater.from(this).inflateTransition(R.transition.my_transition)

        startAnimation = if(startAnimation) {
            TransitionManager.go(nextScene, transition)
            false
        } else {
            TransitionManager.go(scene, transition)
            true
        }
    }
}
