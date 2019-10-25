package com.mcssoft.expandrvtestbed.model

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class ParentItem(private val parentTitle: String, private val lChildren: List<ChildItem>) : ExpandableGroup<ChildItem>(parentTitle, lChildren) {



}