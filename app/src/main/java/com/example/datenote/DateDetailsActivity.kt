package com.example.datenote

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class DateDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.date_details)

        val editData: View = findViewById(R.id.fab_save)
        val eventpicker: Spinner = findViewById(R.id.eventType)
//        eventpicker.setOnItemSelectedListener(this);


        val categories: MutableList<String> = ArrayList()

        categories.add("Item 1")
        categories.add("Item 2")
        categories.add("Item 3")
        categories.add("Item 4")
        categories.add("Item 5")
        categories.add("Item 6")

        val dataAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)

        eventpicker.setAdapter(dataAdapter);

        editData.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }
    }
}