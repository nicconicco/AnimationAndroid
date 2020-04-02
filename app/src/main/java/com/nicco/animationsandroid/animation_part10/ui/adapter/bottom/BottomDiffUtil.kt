package com.nicco.animationsandroid.animation_part10.ui.adapter.bottom

import androidx.recyclerview.widget.DiffUtil

class BottomDiffUtil : DiffUtil.ItemCallback<BottomUi>() {
    override fun areItemsTheSame(
        oldItem: BottomUi,
        newItem: BottomUi
    ): Boolean =
        oldItem.buttonTitle1 == newItem.buttonTitle1

    override fun areContentsTheSame(
        oldItem: BottomUi,
        newItem: BottomUi
    ): Boolean =
        oldItem == newItem
}