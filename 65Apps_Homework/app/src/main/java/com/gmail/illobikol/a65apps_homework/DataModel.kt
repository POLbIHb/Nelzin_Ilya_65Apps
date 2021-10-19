package com.gmail.illobikol.a65apps_homework

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataModel : ViewModel() {
    val check: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val id: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val name: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val phone: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val picture: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}