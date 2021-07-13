package com.example.dishrecipes.view.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.GridLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.dishrecipes.R
import com.example.dishrecipes.application.FavDishApplication
import com.example.dishrecipes.databinding.FragmentAllDishesBinding
import com.example.dishrecipes.view.activities.AddUpdateDishActivity
import com.example.dishrecipes.view.adapters.FavDishAdapter
import com.example.dishrecipes.viewmodel.FavDishViewModel
import com.example.dishrecipes.viewmodel.FavDishViewModelFactory
import com.example.dishrecipes.viewmodel.HomeViewModel

class AllDishesFragment : Fragment() {

    private lateinit var mBinding: FragmentAllDishesBinding

    private val mFavDishViewModel: FavDishViewModel by viewModels{
        FavDishViewModelFactory((requireActivity().application as FavDishApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentAllDishesBinding.inflate(inflater,container,false)
            return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding.rvDishesList.layoutManager = GridLayoutManager(requireActivity(), 2)
        val favDishAdapter: FavDishAdapter(this@AllDishesFragment)


        mFavDishViewModel.allDishesList.observe(viewLifecycleOwner){
            dishes ->
                dishes.let {
                    for(item in it){
                        Log.i("Dish Title", "${item.id} :: ${item.title}")
                    }
                }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_all_dishes,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_add_dish ->{
                startActivity(Intent(requireActivity(), AddUpdateDishActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}