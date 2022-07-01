package com.example.fragmentosgraficosnavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.fragmentosgraficosnavegacion.databinding.FragmentFristBinding
import com.example.fragmentosgraficosnavegacion.databinding.FragmentSecondBinding


class SecondFrag : Fragment() {
    private var b: FragmentSecondBinding? = null
    private val binding get() = b!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        b = FragmentSecondBinding.inflate(layoutInflater)
        return b!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b!!.bSecondFragSig.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFrag_to_thirdFrag, null)
        }
        b!!.bSecFragAtr.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFrag_to_initFrag,null)
        }
    }
}