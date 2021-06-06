package com.example.datenote

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.date_item_view, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(user: User){
            val textViewName = itemView.findViewById<TextView>(R.id.firstLine)
            val textViewDescription = itemView.findViewById<TextView>(R.id.secondtLine)
            textViewName.text = user.name
            textViewDescription.text = user.description
        }
    }
}
