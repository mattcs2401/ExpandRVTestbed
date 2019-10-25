package com.mcssoft.expandrvtestbed.model

import android.os.Parcel
import android.os.Parcelable

class ChildItem() : Parcelable {

    val childTitle = ""

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<ChildItem> {
        override fun createFromParcel(parcel: Parcel): ChildItem {
            return ChildItem(parcel)
        }

        override fun newArray(size: Int): Array<ChildItem?> {
            return arrayOfNulls(size)
        }
    }
}