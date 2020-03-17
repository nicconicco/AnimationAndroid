package com.nicco.animationsandroid.animation_part9.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nicco.animationsandroid.R
import com.nicco.animationsandroid.animation_part9.ViewActionAdapter
import com.nicco.animationsandroid.animation_part9.adapter.NetflixHeaderAdapter.*
import com.nicco.animationsandroid.animation_part9.model.NetflixUi
import kotlinx.android.synthetic.main.netflix_header_fragment.view.*

class NetflixHeaderAdapter(val callback: ViewActionAdapter) :
    ListAdapter<NetflixUi, HeaderViewHolder>(HeaderDiffUtil()) {
    private lateinit var data: MutableList<NetflixUi>

    inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: NetflixUi) = with(itemView) {
            text.text = item.header
            recyclerViewNetflixBody.apply {
                adapter =
                    NetflixCarouselAdapter(
                        item.body,
                        callback
                    )
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder =
        HeaderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.netflix_header_fragment,
                parent,
                false
            )
        )
    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun swapData(list: MutableList<NetflixUi>) {
        this.data = list
        submitList(list)
    }
}

class HeaderDiffUtil : DiffUtil.ItemCallback<NetflixUi>() {
    override fun areItemsTheSame(oldItem: NetflixUi, newItem: NetflixUi): Boolean =
        oldItem.header == newItem.header

    override fun areContentsTheSame(oldItem: NetflixUi, newItem: NetflixUi): Boolean =
        oldItem == newItem
}