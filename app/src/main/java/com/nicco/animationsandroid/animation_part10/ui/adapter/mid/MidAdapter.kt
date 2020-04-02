package com.nicco.animationsandroid.animation_part10.ui.adapter.mid.firstPosition

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nicco.animationsandroid.R
import com.nicco.animationsandroid.animation_part10.ui.adapter.mid.ActionMid
import com.nicco.animationsandroid.animation_part10.ui.adapter.mid.MidDiffUtil
import com.nicco.animationsandroid.animation_part10.ui.adapter.mid.MidUi

private const val MID = 5

class MidAdapter(val action: ActionMid?, val secondAction: ActionMid?) :
    ListAdapter<MidUi, MidAdapter.MidViewHolder>(
        MidDiffUtil()
    ) {

    private lateinit var data: MutableList<MidUi>

    inner class MidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: MidUi) = with(itemView) {

            action?.let {
                action.click(item)
            }

            secondAction?.let {
                secondAction.click(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MidViewHolder =
        MidViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.mid_adapter,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MidViewHolder, position: Int) {
//        holder.bind(getItem(position))
    }

    fun swapData(list: MutableList<MidUi>) {
        this.data = list
    }

    override fun getItemCount(): Int {
        return MID
    }
}

