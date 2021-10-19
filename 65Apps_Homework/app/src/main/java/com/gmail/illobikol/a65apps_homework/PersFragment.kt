package com.gmail.illobikol.a65apps_homework

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBar
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResult
import com.gmail.illobikol.a65apps_homework.databinding.FragmentPersBinding
import androidx.appcompat.app.AppCompatActivity





class PersFragment : Fragment() {
    lateinit var binding:FragmentPersBinding
    private val dataModel:DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentPersBinding.inflate(inflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.id.value = "id9829012"
        dataModel.name.value = "Большой Шлёппа"
        dataModel.phone.value = "+89829908965"
        binding.FullName.text = dataModel.name.value
        binding.PhoneNumber.text = dataModel.phone.value





    }

    companion object{
        @JvmStatic
        fun newInstant() = PersFragment()
    }
}