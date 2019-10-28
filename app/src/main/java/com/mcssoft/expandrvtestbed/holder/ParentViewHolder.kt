package com.mcssoft.expandrvtestbed.holder

import android.view.View
import android.widget.TextView
import com.mcssoft.expandrvtestbed.R
import com.mcssoft.expandrvtestbed.model.ParentItem
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder
import kotlinx.android.synthetic.main.layout_parent.view.*
import android.view.animation.Animation.RELATIVE_TO_SELF
import android.view.animation.RotateAnimation


class ParentViewHolder : GroupViewHolder {

    private var parentTitle: TextView

    constructor(itemView: View) : super(itemView) {
        parentTitle = itemView.findViewById(com.mcssoft.expandrvtestbed.R.id.id_tv_parent)
    }

    fun bind(group: ExpandableGroup<*>) {
        if(group is ParentItem) {
            parentTitle.setText(group.parentTitle)
        }
    }

    override fun expand() {
        animateExpand()
    }

    override fun collapse() {
        animateCollapse()
    }

    private fun animateExpand() {
        val rotate = RotateAnimation(360f, 180f, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f)
        rotate.duration = 300
        rotate.fillAfter = true
//        arrow.setAnimation(rotate)
    }

    private fun animateCollapse() {
        val rotate = RotateAnimation(180f, 360f, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f)
        rotate.duration = 300
        rotate.fillAfter = true
//        arrow.setAnimation(rotate)
    }
}