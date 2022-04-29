package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //getting the recycler view by id
        val recyclerview=findViewById<RecyclerView>(R.id.recyclerview)
        //this creates vertical lay out manger
        recyclerview.layoutManager=LinearLayoutManager(this)
        //arraylist of class item view model
        val data=ArrayList<itemviewmodel>()
        //loop to create views with the same icon
        for (i in 1..20){
            data.add(itemviewmodel(R.drawable.icon1,"item"+ i))}

            //will pas the array list to the adapter
            val adapter=customadapter(data)
            //setting the adapter with recycle view
            recyclerview.adapter=adapter

    }
}

