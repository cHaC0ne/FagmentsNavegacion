package com.example.fragmentosgraficosnavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.fragmentosgraficosnavegacion.databinding.FragmentInitBinding


class InitFrag : Fragment() {
    private var b: FragmentInitBinding? = null
    private val binding get() = b!!
    private var cont = 0



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        b = FragmentInitBinding.inflate(inflater, container , false)
        return b!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b!!.bFragInit1.setOnClickListener {
            val bundle = bundleOf("Contador" to cont.toString())
            view.findNavController().navigate(R.id.action_initFrag_to_fristFrag, bundle)


        }
        b!!.bFragInit2.setOnClickListener {
            view.findNavController().navigate(R.id.action_initFrag_to_secondFrag)
        }
        b!!.tvCOntador.setOnClickListener{
            cont++
            b!!.tvCOntador.text = cont.toString()
        }
        b!!.bFragInit2.setOnClickListener {
            val action = InitFragDirections.actionInitFragToSecondFrag()
            view.findNavController().navigate(action)
        }
    }
}