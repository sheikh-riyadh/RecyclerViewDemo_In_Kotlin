package com.example.recyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.sample_view.view.*

class MyAdapter(var items : ArrayList<Country_Data>) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        lateinit var myViewHolder: MyViewHolder
        myViewHolder = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.sample_view,parent,false))

        return myViewHolder
    }

    override fun getItemCount(): Int {

        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.country_n.text = items[position].country_names
        holder.country_des.text = items[position].country_description
        holder.img.setImageResource(items[position].images)
    }


}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    var country_n = itemView.country_namesID
    var country_des = itemView.country_descriptionID
    var img = itemView.imagesID

}

