package com.nicco.animationsandroid.animation_part10.ui.adapter.bottom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nicco.animationsandroid.R

private const val BOTTOM = 3
class BottomAdapter(val button: ActionBottom): ListAdapter<BottomUi, BottomAdapter.BottomViewHolder>(
BottomDiffUtil()
) {

    inner class BottomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: BottomUi) = with(itemView) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BottomViewHolder = BottomViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.bottom_adapter,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: BottomViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return BOTTOM
    }
}