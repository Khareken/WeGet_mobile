package com.example.weget.ui.hotel

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R
import com.example.weget.ui.hotel.list.HotelFragmentAdapter
import kotlinx.android.synthetic.main.fragment_hotel.*
import kotlinx.android.synthetic.main.top_rating_and_filter_texts_with_icons.*

class HotelFragment : Fragment(R.layout.fragment_hotel) {

    private val hotelFragmentAdapter = HotelFragmentAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hotelsList.adapter = hotelFragmentAdapter
        hotelsList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        hotel_fragment_ic_filter.setOnClickListener {
            showBottomSheetDialogFragment()
        }
    }

    private fun showBottomSheetDialogFragment() {
        val bottomSheetFragment = BottomSheetDialog()
        bottomSheetFragment.show(requireFragmentManager(), bottomSheetFragment.tag)
    }
}