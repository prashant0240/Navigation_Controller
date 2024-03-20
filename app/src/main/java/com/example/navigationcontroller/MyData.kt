package com.example.navigationcontroller

import android.os.Parcel
import android.os.Parcelable

data class MyData(val name: String, val age: Int): Parcelable{
    constructor(parcel : Parcel): this(
        parcel.readString() ?: "",
        parcel.readInt()
    )

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<MyData>{
        override fun createFromParcel(source: Parcel): MyData {
            return MyData(source)
        }

        override fun newArray(size: Int): Array<MyData?> {
            return arrayOfNulls(size)
        }
    }
}
