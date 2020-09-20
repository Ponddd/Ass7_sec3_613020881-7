package com.myweb.ass7

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.epy_item_layout.view.*

class ViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val tvName : TextView = view.tv_name
    val tvGen : TextView = view.tv_gender
    val tvMail: TextView = view.tv_mail
    val tvSalary: TextView = view.tv_salary
}