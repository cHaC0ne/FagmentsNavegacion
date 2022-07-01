package com.example.fragmentosgraficosnavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.fragmentosgraficosnavegacion.databinding.FragmentInitBinding


class InitFrag : Fragment() {
    private var b: FragmentInitBinding? = null
    private val binding get() = b!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        b = FragmentInitBinding.inflate(layoutInflater)
        return b!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b!!.bFragInit1.setOnClickListener {
            view.findNavController().navigate(R.id.action_initFrag_to_fristFrag, null)

        }
        b!!.bFragInit2.setOnClickListener {
            view.findNavController().navigate(R.id.action_initFrag_to_secondFrag)
        }
    }
}