package com.example.intentoslide.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.intentoslide.Main2Activity
import kotlinx.android.synthetic.main.fragment_organizacion.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Fragment5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(com.example.intentoslide.R.layout.fragment_organizacion, container, false)

        view.btnOrganizaciones.setOnClickListener {
            val intent = Intent (getActivity(), Main2Activity::class.java)
            getActivity().apply {
                startActivity(intent)
            }
        }
        return view
    }
}