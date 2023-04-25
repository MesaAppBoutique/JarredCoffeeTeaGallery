package com.jarrodcoffee.example.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jarrodcoffee.example.R
import com.jarrodcoffee.example.databinding.FragmentJarrodCategoriesBinding


class JarrodCategories : Fragment() {

    private var binding: FragmentJarrodCategoriesBinding ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val jarrodCategoriesBinding = FragmentJarrodCategoriesBinding.inflate(inflater, container, false)
        binding = jarrodCategoriesBinding
        return jarrodCategoriesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}