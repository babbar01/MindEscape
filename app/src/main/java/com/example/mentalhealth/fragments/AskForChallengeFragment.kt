package com.example.mentalhealth.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mentalhealth.R
import com.example.mentalhealth.databinding.FragmentAskForChallengeBinding


class AskForChallengeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentAskForChallengeBinding.inflate(inflater, container, false)

        return binding.root
    }

}