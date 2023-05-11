package uz.coderodilov.multiplerecyclerview.helper

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.coderodilov.multiplerecyclerview.R
import uz.coderodilov.multiplerecyclerview.model.ItemsTypes

class DataViewHolder(itemsType: View) : RecyclerView.ViewHolder(itemsType) {

    fun bind(itemsTypes: ItemsTypes) {
        when(itemsTypes){
            is ItemsTypes.ItemHeader ->{
                bindHeader(itemsTypes)
            }

            is ItemsTypes.ItemContact ->{
                bindContact(itemsTypes)
            }

        }
    }

    private fun bindContact(itemsTypes: ItemsTypes.ItemContact) {
        val contact = itemView.findViewById<TextView>(R.id.tvUserPhoneNumber)
        contact.text = itemsTypes.phone
    }

    private fun bindHeader(itemsTypes: ItemsTypes.ItemHeader) {
        val header = itemView.findViewById<TextView>(R.id.tvItemHeader)
        header.text = itemsTypes.time
    }
}