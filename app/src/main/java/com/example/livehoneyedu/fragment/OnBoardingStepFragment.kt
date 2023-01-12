package com.example.livehoneyedu.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.livehoneyedu.R


class OnBoardingStepFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding_step, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = OnBoardingStepFragment()
    }
}