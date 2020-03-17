package com.nicco.animationsandroid.animation_part9

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import com.nicco.animationsandroid.R
import com.nicco.animationsandroid.animation_part6.SequenceAnimationActivity
import com.nicco.animationsandroid.animation_part9.adapter.NetflixHeaderAdapter
import com.nicco.animationsandroid.animation_part9.model.NetflixBodyUi
import kotlinx.android.synthetic.main.activity_netflix.*

const val EXTRA_NETFLIX_ITEM = "EXTRA_NETFLIX_ITEM"
const val EXTRA_NETFLIX_IMAGE_TRANSITION = "EXTRA_NETFLIX_IMAGE_TRANSITION"

class NetflixActivity : AppCompatActivity(), ViewActionAdapter {
    private val adapter: NetflixHeaderAdapter by lazy {
        NetflixHeaderAdapter(
            this
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netflix)
        recyclerViewNetflixTop.adapter = adapter
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        adapter.swapData(NetflixFactory.createObjectComponent().toMutableList())
        return super.onCreateView(name, context, attrs)
    }

    override fun onClickDetailNetflix(netflix: NetflixBodyUi, imageView: ImageView) {
        val intent = Intent(this, SequenceAnimationActivity::class.java)
        intent.putExtra(EXTRA_NETFLIX_ITEM, netflix.toString())
        intent.putExtra(EXTRA_NETFLIX_IMAGE_TRANSITION, ViewCompat.getTransitionName(imageView))

        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this,
            imageView,
            ViewCompat.getTransitionName(imageView)!!
        )

        startActivity(intent, options.toBundle())
    }
}
