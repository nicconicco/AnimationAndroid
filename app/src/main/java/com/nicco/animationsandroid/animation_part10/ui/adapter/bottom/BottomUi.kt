package com.nicco.animationsandroid.animation_part10.ui.adapter.bottom

enum class Button(val action: String) {
    ACTION_1("ACTION_1"),
    ACTION_2("ACTION_2"),
    ACTION_3("ACTION_3"),
    ACTION_4("ACTION_4")
}

data class BottomUi(val buttonTitle1: String, val buttonTitle2: String, val buttonTitle3: String, val buttonTitle4: String, val button: Button)