package com.nicco.animationsandroid.animation_part10.ui.adapter.top

import androidx.recyclerview.widget.DiffUtil

class HeaderDiffUtil : DiffUtil.ItemCallback<HeaderDescriptionUi>() {
    override fun areItemsTheSame(
        oldItem: HeaderDescriptionUi,
        newItem: HeaderDescriptionUi
    ): Boolean =
        oldItem.title == newItem.title

    override fun areContentsTheSame(
        oldItem: HeaderDescriptionUi,
        newItem: HeaderDescriptionUi
    ): Boolean =
        oldItem == newItem
}