package com.mcssoft.expandrvtestbed.holder

import android.view.View
import android.widget.TextView
import com.mcssoft.expandrvtestbed.R
import com.mcssoft.expandrvtestbed.model.ParentItem
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder
import kotlinx.android.synthetic.main.layout_parent.view.*

class ParentViewHolder : GroupViewHolder {

    private lateinit var parentTitle: TextView

    constructor(itemView: View) : super(itemView) {
        parentTitle = itemView.findViewById(R.id.id_tv_parent)
    }

    fun bind(parent: ParentItem) {
        parentTitle.setText(parent.parentTitle)
    }
}