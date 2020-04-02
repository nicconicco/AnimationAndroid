package com.nicco.animationsandroid.animation_part10.ui.adapter.mid

import androidx.recyclerview.widget.DiffUtil

class MidDiffUtil : DiffUtil.ItemCallback<MidUi>() {
    override fun areItemsTheSame(
        oldItem: MidUi,
        newItem: MidUi
    ): Boolean =
        oldItem.description == newItem.description

    override fun areContentsTheSame(
        oldItem: MidUi,
        newItem: MidUi
    ): Boolean =
        oldItem == newItem
}