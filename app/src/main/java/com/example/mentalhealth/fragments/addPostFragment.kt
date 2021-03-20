package com.example.mentalhealth.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mentalhealth.R
import com.example.mentalhealth.databinding.FragmentAddPostBinding

class addPostFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentAddPostBinding.inflate(inflater, container, false)

        return  binding.root

    }
}