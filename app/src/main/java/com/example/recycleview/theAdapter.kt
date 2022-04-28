package com.example.recycleview

import android.provider.ContactsContract
import androidx.recyclerview.widget.RecyclerView

class theAdapter(private val photos: ArrayList<Photo>):
    RecyclerView.Adapter<theAdapter.PhotoHolder>() //theAdapter class extends Recyclerview.Adapter()

{
    override fun getItemCount() = photos.size //To get the size/number of photos in the holder
}