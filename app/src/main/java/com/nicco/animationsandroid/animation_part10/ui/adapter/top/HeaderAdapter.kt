package com.nicco.animationsandroid.animation_part10.ui.adapter.top

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nicco.animationsandroid.R
import kotlinx.android.synthetic.main.header_adapter.view.*

private const val HEADER = 1

class HeaderAdapter(val callback: ActionHeader) :
    ListAdapter<HeaderDescriptionUi, HeaderAdapter.HeaderViewHolder>(
        HeaderDiffUtil()
    ) {

    inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: HeaderDescriptionUi) = with(itemView) {
            tvTitle.text = item.title
            tvLimit.text = item.limitTitle
            tvType.text = item.type

            card.setOnClickListener {
                callback?.let {
                    callback.click(item)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder =
        HeaderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.header_adapter,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
//        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {
        return HEADER
    }
}