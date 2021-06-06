package com.example.datenote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.dateRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val users = ArrayList<User>()

        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Delta Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        users.add(User("Apexit Dhandav","this is delta description"))
        

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}