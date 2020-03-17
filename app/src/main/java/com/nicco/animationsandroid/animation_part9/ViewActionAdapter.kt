package com.nicco.animationsandroid.animation_part9

import android.widget.ImageView
import com.nicco.animationsandroid.animation_part9.model.NetflixBodyUi

interface ViewActionAdapter {
    fun onClickDetailNetflix(netflix: NetflixBodyUi, imageView: ImageView)
}