package com.example.sagar.navigationuidemo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 * Use the [BottomNavFragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class BottomNavFragmentOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_nav_fragment_one, container, false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment BottomNavFragmentOne.
         */
        @JvmStatic
        fun newInstance() = BottomNavFragmentOne()
    }
}