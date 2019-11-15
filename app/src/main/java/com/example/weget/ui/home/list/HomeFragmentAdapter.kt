package com.example.weget.ui.home.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R

class HomeFragmentAdapter : RecyclerView.Adapter<HomeFragmentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_of_list_promos_today, parent, false)
        return HomeFragmentViewHolder(itemView)
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: HomeFragmentViewHolder, position: Int) {
        holder.populateModel()
    }
}