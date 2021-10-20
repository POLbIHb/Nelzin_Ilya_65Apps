package com.gmail.illobikol.a65apps_homework

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResultListener
import com.gmail.illobikol.a65apps_homework.databinding.ContactCellBinding
import com.gmail.illobikol.a65apps_homework.databinding.FragmentLinkBinding
import com.gmail.illobikol.a65apps_homework.databinding.FragmentPersBinding


class LinkFragment : Fragment() {
    lateinit var binding: ContactCellBinding
    private val dataModel:DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ContactCellBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.FullNameLink.text  = dataModel.name.value
        binding.PhoneNumberLink.text  = dataModel.phone.value

        (activity as MainActivity).supportActionBar?.title = getString(R.string.contact_details) + dataModel.id.value
    }

    override fun onDetach() {
        (activity as MainActivity).supportActionBar?.title = getString(R.string.contact_list)
        dataModel.check.value = "1"
        super.onDetach()
    }
    companion object{
        fun newInstant() = LinkFragment()
    }

}