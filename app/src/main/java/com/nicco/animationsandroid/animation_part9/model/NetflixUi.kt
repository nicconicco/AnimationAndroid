package com.nicco.animationsandroid.animation_part9.model

data class NetflixUi(val header: String, val body: List<NetflixBodyUi>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val that = other as NetflixUi?
        that?.apply {
            return header == that.header
        }

        return false
    }
}
