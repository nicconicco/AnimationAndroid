package com.nicco.animationsandroid.animation_part9.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.nicco.animationsandroid.R
import com.nicco.animationsandroid.animation_part9.ViewActionAdapter
import com.nicco.animationsandroid.animation_part9.model.NetflixBodyUi
import kotlinx.android.synthetic.main.netflix_body_fragment.view.*
import kotlinx.android.synthetic.main.netflix_header_fragment.view.text

class NetflixCarouselAdapter(
    private val list: List<NetflixBodyUi>,
    val callback: ViewActionAdapter?
) :
    RecyclerView.Adapter<NetflixCarouselAdapter.BodyViewHolder>() {
    inner class BodyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) = with(itemView) {
            text.text = list[position].title
            subtitle.text = list[position].subtitle
            info.text = list[position].info

            card.setOnClickListener {
                callback?.let {
                    callback.onClickDetailNetflix(list[position], image)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BodyViewHolder =
        BodyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.netflix_body_fragment, parent, false
            )
        )

    override fun onBindViewHolder(holder: BodyViewHolder, position: Int) {
        holder.bind(position)
    }
}

class BodyDiffUtil : DiffUtil.ItemCallback<NetflixBodyUi>() {
    override fun areItemsTheSame(oldItem: NetflixBodyUi, newItem: NetflixBodyUi): Boolean =
        oldItem.info == newItem.info

    override fun areContentsTheSame(oldItem: NetflixBodyUi, newItem: NetflixBodyUi): Boolean =
        oldItem == newItem
}