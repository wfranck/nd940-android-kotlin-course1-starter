package com.udacity.shoestore.screens.shoedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.screens.ShoesViewModel
import com.udacity.shoestore.models.Shoe

class ShoeDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail, container, false)
        val shoeModel: ShoesViewModel = ViewModelProvider(requireActivity()).get(ShoesViewModel::class.java)
        val shoe = Shoe("", "", "", R.drawable.no_shoe)
        binding.shoe = shoe

        binding.addShoeButton.setOnClickListener{
            //if (shoe.name.isNotBlank() && shoe.features.isNotBlank()) {
                shoeModel.addShoe(shoe)
                Navigation.findNavController(it).navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment2())
//            } else {
//                Toast.makeText( requireContext(), "The shoe require Name and Feature", Toast.LENGTH_LONG ).show()
//            }
        }

        return binding.root
    }
}