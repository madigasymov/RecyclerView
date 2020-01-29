package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.vh_message.view.*
import java.text.SimpleDateFormat
import java.util.*

class ChatVH(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.vh_message, parent, false)) {

    fun bind(model: ChatModel) {

        itemView.apply {
            userName.text = model.userName
            lastMssg.text = model.lastMssg
            Glide.with(this).load(model.userIcon).into(userIcon)
            val dateFormat = SimpleDateFormat("d-MMM HH:mm", Locale.getDefault())
            time.text = dateFormat.format(model.time)
            counterMssg.text = model.counterMssg.toString()
        }
    }
}