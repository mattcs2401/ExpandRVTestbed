package com.mcssoft.expandrvtestbed.holder

import android.view.View
import android.widget.TextView
import com.mcssoft.expandrvtestbed.R
import com.mcssoft.expandrvtestbed.model.ChildItem
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder
import kotlinx.android.synthetic.main.layout_child.view.*

class ChildsViewHolder : ChildViewHolder {

    private var childTitle: TextView

    constructor(itemView: View) : super(itemView) {
        childTitle = itemView.findViewById(R.id.id_tv_child)
    }

    fun bind(child: ChildItem) {
        childTitle.setText(child.childTitle)
    }
}