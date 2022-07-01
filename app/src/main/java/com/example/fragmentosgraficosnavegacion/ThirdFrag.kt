package com.example.fragmentosgraficosnavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.fragmentosgraficosnavegacion.databinding.FragmentSecondBinding
import com.example.fragmentosgraficosnavegacion.databinding.FragmentThirdBinding

class ThirdFrag : Fragment() {
    private var b: FragmentThirdBinding? = null
    private val binding get() = b!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        b = FragmentThirdBinding.inflate(inflater, container, false)
        return b!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b!!.bThirdFragAtras.setOnClickListener {
            view.findNavController().navigate(R.id.action_thirdFrag_to_secondFrag,null)
        }
        b!!.bThirdFragInicio.setOnClickListener {
            view.findNavController().navigate(R.id.action_thirdFrag_to_initFrag,null)
        }
    }
}