package com.myweb.ass7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class EmployeeAdapter(val item : List<Employee>, val context: Context): RecyclerView.Adapter <ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.epy_item_layout,parent,false)
        return ViewHolder(view_item)
    }

    override fun onBindViewHolder(holder: ViewHolder,position: Int) {
        holder.tvName.text = item[position].name
        holder.tvGen.text = item[position].gender.toString()
        holder.tvMail.text = item[position].mail
        holder.tvSalary.text = item[position].salary.toString()
    }

    override fun getItemCount(): Int {
        return item.size
    }
}