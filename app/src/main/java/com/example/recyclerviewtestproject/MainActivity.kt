package com.example.recyclerviewtestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtestproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var item = mutableListOf<DataClass>()
        item.add(DataClass(1 , "A"))
        item.add(DataClass(2 , "B"))
        item.add(DataClass(3 , "C"))
        item.add(DataClass(4 , "D"))

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(this,item )
        binding.recyclerView.adapter = adapter



        var i = 5
        binding.addButton.setOnClickListener {
            item.add(DataClass(i , "K"))
            i++
            adapter.notifyDataSetChanged()
        }
    }
}