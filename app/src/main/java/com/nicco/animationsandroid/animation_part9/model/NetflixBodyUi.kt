package com.nicco.animationsandroid.animation_part9.model

data class NetflixBodyUi(val title: String, val subtitle: String, val info: String) {
    override fun toString(): String {
        return "$title - $subtitle - $info"
    }
}