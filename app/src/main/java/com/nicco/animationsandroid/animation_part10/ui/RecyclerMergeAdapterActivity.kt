package com.nicco.animationsandroid.animation_part10.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.MergeAdapter
import com.nicco.animationsandroid.R
import com.nicco.animationsandroid.animation_part10.ui.adapter.bottom.ActionBottom
import com.nicco.animationsandroid.animation_part10.ui.adapter.bottom.BottomAdapter
import com.nicco.animationsandroid.animation_part10.ui.adapter.mid.ActionMid
import com.nicco.animationsandroid.animation_part10.ui.adapter.mid.MidUi
import com.nicco.animationsandroid.animation_part10.ui.adapter.mid.firstPosition.MidAdapter
import com.nicco.animationsandroid.animation_part10.ui.adapter.top.ActionHeader
import com.nicco.animationsandroid.animation_part10.ui.adapter.top.HeaderAdapter
import com.nicco.animationsandroid.animation_part10.ui.adapter.top.HeaderDescriptionUi
import kotlinx.android.synthetic.main.activity_recycler_merge_adapter.*

class RecyclerMergeAdapterActivity : AppCompatActivity() {

    private val headerAdapter by lazy {
        HeaderAdapter(object : ActionHeader {
            override fun click(type: HeaderDescriptionUi) {
            }
        })
    }

    private val midAdapter by lazy {
        MidAdapter(action = object : ActionMid {
            override fun click(type: MidUi) {
            }
        }, secondAction = object : ActionMid {
            override fun click(type: MidUi) {
            }
        })
    }

    private val bottomAdapter by lazy {
        BottomAdapter(object : ActionBottom {
            override fun click() {
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_merge_adapter)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val mergeAdapter =
            MergeAdapter(headerAdapter, midAdapter, bottomAdapter)

         recycler.adapter = mergeAdapter
    }
}
