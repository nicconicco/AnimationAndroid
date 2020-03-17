package com.nicco.animationsandroid.animation_part8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.nicco.animationsandroid.R

class CardAdapter(
    private val withHeader: Boolean = false
) : RecyclerView.Adapter<ViewHolder>() {
    override fun getItemCount() = 64
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(parent.inflate(R.layout.row_empty_card))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = Unit
    override fun getItemViewType(position: Int) = if (withHeader && position == 0) 0 else 1
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

private fun ViewGroup.inflate(@LayoutRes layout: Int, attach: Boolean = false) =
    LayoutInflater.from(context).inflate(layout, this, attach)