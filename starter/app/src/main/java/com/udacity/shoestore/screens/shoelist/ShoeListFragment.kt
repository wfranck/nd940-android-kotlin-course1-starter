package com.udacity.shoestore.screens.shoelist

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.databinding.FragmentShoeListDetailBinding
import com.udacity.shoestore.screens.ShoesViewModel
import timber.log.Timber


class ShoeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)
        val shoeModel: ShoesViewModel = ViewModelProvider(requireActivity()).get(ShoesViewModel::class.java)

        shoeModel.shoes.value?.forEach { shoe ->
            val bindingShoe: FragmentShoeListDetailBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list_detail, binding.shoeLayout, true)
            bindingShoe.imageShoe.setImageResource(shoe.images)
            bindingShoe.nameShoe.text = shoe.name
            bindingShoe.featureShoe.text = shoe.features
        }

        setHasOptionsMenu(true)

        binding.addShoeButton.setOnClickListener(Navigation.createNavigateOnClickListener(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment()))

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            (R.id.logout) -> {
                Navigation.findNavController(requireView()).navigate(ShoeListFragmentDirections.actionShoeListFragmentToLoginFragment())
            }
        }
        return super.onOptionsItemSelected(item)
    }



}