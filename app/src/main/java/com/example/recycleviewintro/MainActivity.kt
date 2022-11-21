package com.example.recycleviewintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var persons = mutableListOf<Person>(
        Person("Antonio", 39),
        Person("Khaled", 28),
        Person("Ahmed", 23),
        Person("Mattias", 28),
        Person("Gustaf", 26)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PersonRecycleAdapter(this, persons)

        recyclerView.adapter = adapter
    }

}