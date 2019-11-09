package com.example.weget.ui.hotel

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R
import com.example.weget.ui.hotel.list.HotelFragmentAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.filter_dialog_layout.*
import kotlinx.android.synthetic.main.fragment_hotel.*
import kotlinx.android.synthetic.main.top_rating_and_filter_texts_with_icons.*

class HotelFragment : Fragment(R.layout.fragment_hotel) {

    private val hotelFragmentAdapter = HotelFragmentAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hotelsList.adapter = hotelFragmentAdapter
        hotelsList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        val bottomSheetDialog = BottomSheetDialog(context!!)
        bottomSheetDialog.setContentView(R.layout.filter_dialog_layout)
        bottomSheetDialog.setCancelable(false)
        hotel_fragment_ic_filter.setOnClickListener {
            bottomSheetDialog.show()
        }
        mutableAvgPrice.text =  "1 + $seekBar.selectedMaxValue.toString()"
    }
}