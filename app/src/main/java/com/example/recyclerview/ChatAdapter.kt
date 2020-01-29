package com.example.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(
    private val chatModels: List<ChatModel>
) : RecyclerView.Adapter<ChatVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatVH {
        return ChatVH(parent)
    }

    override fun getItemCount() = chatModels.size

    override fun onBindViewHolder(holder: ChatVH, position: Int) {
        holder.bind(chatModels[position])
    }
}