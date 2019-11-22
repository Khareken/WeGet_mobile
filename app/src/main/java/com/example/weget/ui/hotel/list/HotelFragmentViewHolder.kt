package com.example.weget.ui.hotel.list

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R


class HotelFragmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val nameOfHotel: TextView = itemView.findViewById(R.id.hotel_fragment_item_hotel_name)
    private val hotelLocationCoords: TextView = itemView.findViewById(R.id.hotel_fragment_item_location_coords)
    private val hotelLocationName: TextView = itemView.findViewById(R.id.hotel_fragment_item_location_name)
    private val ratingBar: RatingBar = itemView.findViewById(R.id.hotel_fragment_item_ratingBar)
    private val cost: TextView = itemView.findViewById(R.id.hotel_fragment_item_price)
    private val avgNight: TextView = itemView.findViewById(R.id.hotel_fragment_item_text_avg_night)
    private val roomsQuantity: TextView = itemView.findViewById(R.id.hotel_fragment_item_quantity_of_rooms)
    val imageOfHotel: ImageView = itemView.findViewById(R.id.hotel_fragment_item_imageView)

    fun populateModel(){

    }
}