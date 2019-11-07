package com.example.weget.ui.home.list

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R

class HomeFragmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val attactionAndActvities: TextView =
        itemView.findViewById(R.id.text_attaction_amp_activities)
    private val places: TextView = itemView.findViewById(R.id.text_barcelona)
    private val bookNow: TextView = itemView.findViewById(R.id.text_book_now)

    @SuppressLint("SetTextI18n")
    fun populateModel() {
        attactionAndActvities.text = "Attaction & Activities"
        places.text = "Barcelona"
        bookNow.text = "Book Now"
    }
}
