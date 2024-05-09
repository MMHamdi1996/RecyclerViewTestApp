package com.example.recyclerviewtestproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerviewtestproject.databinding.RecyclerLayoutBinding

class MyAdapter(val context: Context, val item: MutableList<DataClass>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    inner class MyViewHolder(val binding: RecyclerLayoutBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(RecyclerLayoutBinding.inflate(LayoutInflater.from(context), parent, false))

    override fun getItemCount() = item.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.textView.text = item[position].numberItems.toString()
        //holder.binding.engView.text = item[position].nameItems

        holder.binding.deleteButton.setOnClickListener {
            item.removeAt(position)
            notifyDataSetChanged()
        }

    }
}
