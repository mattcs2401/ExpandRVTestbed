package com.mcssoft.expandrvtestbed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mcssoft.expandrvtestbed.R
import com.mcssoft.expandrvtestbed.holder.ChildsViewHolder
import com.mcssoft.expandrvtestbed.holder.ParentViewHolder
import com.mcssoft.expandrvtestbed.model.ChildItem
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class ParentAdapter : ExpandableRecyclerViewAdapter<ParentViewHolder, ChildsViewHolder> {

    constructor(groups: List<ExpandableGroup<*>>) : super(groups) {

    }

    override fun onCreateGroupViewHolder(parent: ViewGroup?, viewType: Int): ParentViewHolder {
        val view: View = LayoutInflater.from(parent?.context).inflate(R.layout.layout_parent, parent, false)
        return ParentViewHolder(view)
    }

    override fun onCreateChildViewHolder(parent: ViewGroup?, viewType: Int): ChildsViewHolder {
        val view: View = LayoutInflater.from(parent?.context).inflate(R.layout.layout_child, parent, false)
        return ChildsViewHolder(view)
    }

    override fun onBindChildViewHolder(holder: ChildsViewHolder?, flatPosition: Int, group: ExpandableGroup<*>?, childIndex: Int) {
        val childGroup = group as ExpandableGroup<ChildItem>
        val childItem: ChildItem = childGroup.items.get(childIndex)
        holder?.bind(childItem)
    }

    override fun onBindGroupViewHolder(holder: ParentViewHolder?, flatPosition: Int, group: ExpandableGroup<*>?) {
        //holder.o
    }
}
