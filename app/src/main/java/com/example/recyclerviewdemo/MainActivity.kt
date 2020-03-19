package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdemo.R.drawable
import com.example.recyclerviewdemo.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var country_list : ArrayList<Country_Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)
        country_list = ArrayList()
        addCountry()

        recyclerViewID.layoutManager = LinearLayoutManager(this)
        recyclerViewID.addItemDecoration(DividerItemDecoration(this,1))
        recyclerViewID.adapter = MyAdapter(country_list)



    }

    fun addCountry(){
        country_list.add(Country_Data("Afghanistan","Afghanistan is a muslim country and beautiful country",R.drawable.afghanistan))
        country_list.add(Country_Data("America","America is good country",R.drawable.american_flag))
        country_list.add(Country_Data("Bangladesh","Bangladesh is good",R.drawable.bangladesh_flag))
        country_list.add(Country_Data("India","India is good",R.drawable.indian_flag))
        country_list.add(Country_Data("Iran","is a muslim country and beautiful country",R.drawable.iran))
        country_list.add(Country_Data("Iraq","Iraq is a muslim country and beautiful country",R.drawable.iraq))
        country_list.add(Country_Data("Mexico","Mexico is good country",R.drawable.maxico_flag))
        country_list.add(Country_Data("Pakistan","Pakistan is a muslim country and beautiful country",R.drawable.pakistan))
        country_list.add(Country_Data("Philippines","Philippines is good country",R.drawable.philipines))
        country_list.add(Country_Data("Saudi Arab","Saudi arab is a muslim country and beautiful country",R.drawable.saudi_arabia))
        country_list.add(Country_Data("Ukraine","Ukraine is good country",R.drawable.ukraine_flag))
        country_list.add(Country_Data("United Kingdom","United kingdom is good country",R.drawable.unitedkingdome))

    }
}

