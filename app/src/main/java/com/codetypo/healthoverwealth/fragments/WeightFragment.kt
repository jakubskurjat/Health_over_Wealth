package com.codetypo.healthoverwealth.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codetypo.healthoverwealth.R
import kotlinx.android.synthetic.main.fragment_bmi.*
import kotlinx.android.synthetic.main.fragment_weight.*


class WeightFragment : Fragment() {

    var weightInterface: WeightFragmentInterface? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weight, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        try {
            weightInterface = context as WeightFragmentInterface
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString() + " must implement OnHeadlineSelectedListener")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        weightBody.setOnClickListener{
            weightInterface?.onWeightBodyClicked()
        }
    }


    interface WeightFragmentInterface {
        fun onWeightBodyClicked()
    }

}