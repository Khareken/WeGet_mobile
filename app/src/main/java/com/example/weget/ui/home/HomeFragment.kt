package com.example.weget.ui.home

import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weget.R
import com.example.weget.ui.home.list.HomeFragmentAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.dialog_search.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.home_search.*

class HomeFragment : Fragment(R.layout.fragment_home) {
    private val homeFragmentAdapter: HomeFragmentAdapter = HomeFragmentAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        todayPromosList.adapter = homeFragmentAdapter
        todayPromosList.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)

        toursList.adapter = homeFragmentAdapter
        toursList.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)

        promotionList.adapter = homeFragmentAdapter
        promotionList.layoutManager =
            GridLayoutManager(context, 2)

        homeSearch.setOnClickListener {
            showBottomSheetDialogFragment()
        }

    }


    private fun showBottomSheetDialogFragment() {
        val bottomSheetSearchDialog = BottomSheetSearchDialog()
        bottomSheetSearchDialog.show(requireFragmentManager(), bottomSheetSearchDialog.tag)
    }
}