package com.example.list.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.list.R
import com.example.list.model.UserModel
import kotlinx.android.synthetic.main.item_user_layout.view.*

class UserAdapter(private val context: Context):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private var userList = emptyList<UserModel>()

    class UserViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout, parent, false)
        return UserViewHolder(view)
    }


    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemView.tv_last_name.text = userList[position].lastName
        holder.itemView.tv_first_name.text = userList[position].firsName
        holder.itemView.setOnClickListener{
            Toast.makeText(context, "Еблан",Toast.LENGTH_SHORT).show()
        }
    }


    override fun getItemCount(): Int {
        return userList.size
    }

    fun setList(list: List<UserModel>){
        userList = list
        notifyDataSetChanged()
    }
}