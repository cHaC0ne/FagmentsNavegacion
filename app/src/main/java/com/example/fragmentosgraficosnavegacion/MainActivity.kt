package com.example.fragmentosgraficosnavegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.fragmentosgraficosnavegacion.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.bNavView.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.bInicio -> {
                    Navigation.findNavController(b.fragmentContainerView)
                        .navigate(R.id.initFrag)
                    true
                }
                R.id.bProfile -> {
                    findNavController(R.id.fragmentContainerView)
                        .navigate(R.id.fristFrag)
                    true
                }
                R.id.bSetting -> {
                    b.fragmentContainerView.findNavController()
                        .navigate(R.id.secondFrag)
                    true
                }
                else -> false
            }
        }
    }
}