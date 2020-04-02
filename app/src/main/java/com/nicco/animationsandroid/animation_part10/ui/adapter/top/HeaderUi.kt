package com.nicco.animationsandroid.animation_part10.ui.adapter.top

enum class LIMIT { MAX, MEDIUM, EASY }

data class HeaderDescriptionUi(val title: String, val limitTitle: String, val limit: LIMIT, val type: String)