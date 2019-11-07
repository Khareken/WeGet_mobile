package com.example.weget.ui.hotel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R
import com.example.weget.ui.hotel.list.HotelFragmentAdapter
import kotlinx.android.synthetic.main.fragment_hotel.*

class HotelFragment : Fragment() {
    private val hotelFragmentAdapter = HotelFragmentAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hotel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hotelsList.adapter = hotelFragmentAdapter
        hotelsList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

    }
}