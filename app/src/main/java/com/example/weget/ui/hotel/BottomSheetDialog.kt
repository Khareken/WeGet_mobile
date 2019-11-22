package com.example.weget.ui.hotel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weget.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.filter_dialog_layout.*

class BottomSheetDialog : BottomSheetDialogFragment() {
    private var fragmentView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentView = inflater.inflate(R.layout.filter_dialog_layout, container, false)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        seekBar.setOnRangeSeekBarChangeListener { bar, number, number2 ->
            mutableAvgPrice.text = "$$number - $$number2"
        }
        minusBtn.setOnClickListener {
            numberOfAdults.text = (numberOfAdults.text.toString().toInt() - 1).toString()
        }
        plusBtn.setOnClickListener {
            numberOfAdults.text = (numberOfAdults.text.toString().toInt() + 1).toString()
        }
        minusBtnChildren.setOnClickListener {
            numberOfChildren.text = (numberOfChildren.text.toString().toInt() - 1).toString()
        }
        plusBtnChildren.setOnClickListener {
            numberOfChildren.text = (numberOfChildren.text.toString().toInt() + 1).toString()
        }
    }
}