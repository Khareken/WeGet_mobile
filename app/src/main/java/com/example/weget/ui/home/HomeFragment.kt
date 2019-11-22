package com.example.weget.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R
import com.example.weget.ui.home.list.HomeFragmentAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private val homeFragmentAdapter: HomeFragmentAdapter = HomeFragmentAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        todayPromosList.adapter = homeFragmentAdapter
        todayPromosList.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        toursList.adapter = homeFragmentAdapter
        toursList.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        promotionList.adapter = homeFragmentAdapter
        promotionList.layoutManager = GridLayoutManager(context, 2)
    }
}