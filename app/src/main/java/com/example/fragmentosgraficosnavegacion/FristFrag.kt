package com.example.fragmentosgraficosnavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.fragmentosgraficosnavegacion.databinding.FragmentFristBinding
import com.example.fragmentosgraficosnavegacion.databinding.FragmentInitBinding


class FristFrag : Fragment() {
    private var b: FragmentFristBinding? = null
    private val binding get() = b!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        b = FragmentFristBinding.inflate(inflater, container, false)
        return b!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b!!.bFragFirst.setOnClickListener {
            view.findNavController().navigate(R.id.action_fristFrag_to_initFrag, null)
        }

        b!!.tvCOnt2.setText(arguments?.getString("Contador"))
//        b!!.bFragFirst.setOnClickListener (
//            Navigation.findNavController(view).navigate(R.id.initFrag) // esto es lo mismo que lo de arriba
//        )
    }
}