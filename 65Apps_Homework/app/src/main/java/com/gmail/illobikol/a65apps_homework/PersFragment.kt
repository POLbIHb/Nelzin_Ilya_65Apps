package com.gmail.illobikol.a65apps_homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.gmail.illobikol.a65apps_homework.databinding.FragmentPersBinding

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
        dataModel.id.value = getString(R.string.id)
        dataModel.name.value = getString(R.string.name)
        dataModel.phone.value = getString(R.string.second_phone_number)
        binding.FullName.text = dataModel.name.value
        binding.PhoneNumber.text = dataModel.phone.value
    }

    companion object{
        fun newInstant() = PersFragment()
    }
}