package com.nicco.animationsandroid.animation_part9

import com.nicco.animationsandroid.animation_part9.model.NetflixBodyUi
import com.nicco.animationsandroid.animation_part9.model.NetflixUi

object NetflixFactory {
    fun createObjectComponent(): MutableList<NetflixUi> {
        val netflix = mutableListOf<NetflixUi>()
        repeat(10) {
            netflix.add(
                NetflixUi(
                    "Header + $it",
                    createBodyList()
                )
            )
        }
        return netflix
    }

    private fun createBodyList(): MutableList<NetflixBodyUi> {
        val netflixBody = mutableListOf<NetflixBodyUi>()
        repeat(10) {
            netflixBody.add(
                NetflixBodyUi(
                    "Title + $it",
                    "Subtitle + $it",
                    "Info + $it"
                )
            )
        }
        return netflixBody
    }
}