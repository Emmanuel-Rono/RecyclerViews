package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    private lateinit var linearLayoutManager: LinearLayoutManager//The layout used br recycleview

    override fun onCreate(savedInstanceState: Bundle?) {
        linearLayoutManager = LinearLayoutManager(this)
       val recyclerView=findViewById<RecyclerView>(R.id.RsView)
        recyclerView.layoutManager = linearLayoutManager
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}