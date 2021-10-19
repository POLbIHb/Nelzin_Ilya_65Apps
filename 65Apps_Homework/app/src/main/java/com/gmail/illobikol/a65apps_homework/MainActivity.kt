package com.gmail.illobikol.a65apps_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.os.bundleOf
import com.gmail.illobikol.a65apps_homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    private val dataModel:DataModel by viewModels()

    var check = "1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Список контактов"
        dataModel.check.value = check

        binding.placeHolder.setOnClickListener{
            if(dataModel.check.value == "1"){
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.place_holder2,LinkFragment.newInstant())
                    .addToBackStack("LinkFragment")
                    .commit()
                dataModel.check.value = "0"
            }
        }


        supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder,PersFragment.newInstant())
            .commit()




    }




}
