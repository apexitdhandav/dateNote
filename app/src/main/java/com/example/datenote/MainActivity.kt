package com.example.datenote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: View = findViewById(R.id.fab)
        val recyclerView = findViewById<RecyclerView>(R.id.dateRecyclerView)
        val users = ArrayList<User>()
        val adapter = CustomAdapter(users)

        fab.setOnClickListener {
            val intent = Intent(this@MainActivity, DateDetailsActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
        }

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        users.add(User("Apexit Dhandav","this is delta description"))

        recyclerView.adapter = adapter
    }
}