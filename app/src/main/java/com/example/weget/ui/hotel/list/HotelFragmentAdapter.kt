package com.example.weget.ui.hotel.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R

class HotelFragmentAdapter : RecyclerView.Adapter<HotelFragmentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelFragmentViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).
                inflate(R.layout.item_of_list_hotels, parent, false)
        return HotelFragmentViewHolder(itemView)
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: HotelFragmentViewHolder, position: Int) {

    }
}

