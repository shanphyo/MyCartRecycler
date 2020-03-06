package com.mic.mycart.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mic.findcrush.Adapter.PostRecyclerCustomAdapter
import com.mic.mycart.Cart

import com.mic.mycart.R
import kotlinx.android.synthetic.main.fragment_cartfragment.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Cartfragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Cartfragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root=inflater.inflate(R.layout.fragment_cartfragment, container, false)
        var arr=ArrayList<Cart>()
        arr.add(Cart(R.drawable.sugar1,"Fine Grain Sugar","$20 Discount","$20.00","1 Kg"))
        arr.add(Cart(R.drawable.penuts,"Peanuts","$10 Discount","$20.00","3 Kg"))
        arr.add(Cart(R.drawable.rice,"Dawat Rice","$15 Discount","$80.00","2 Kg"))

        var postAdapter= PostRecyclerCustomAdapter(arr)
        root.rv.layoutManager= LinearLayoutManager(root.context)
        root.rv.adapter=postAdapter
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Cartfragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Cartfragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
