package com.example.weget.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weget.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.dialog_search.*

class BottomSheetSearchDialog : BottomSheetDialogFragment() {
    private var fragmentView: View? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentView = inflater.inflate(R.layout.dialog_search, container, false)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(this)

    }

    private fun initView(bottomSheetSearchDialog: BottomSheetSearchDialog) {
        bottomSheetSearchDialog.
        search_dialog_ic_close.setOnClickListener {
            bottomSheetSearchDialog.dismiss()
        }
    }

}

