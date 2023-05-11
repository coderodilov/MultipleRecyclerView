package uz.coderodilov.multiplerecyclerview.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.coderodilov.multiplerecyclerview.R
import uz.coderodilov.multiplerecyclerview.helper.DataViewHolder
import uz.coderodilov.multiplerecyclerview.model.ItemsTypes

class ContactAdapter : RecyclerView.Adapter<DataViewHolder>() {
    private val dataList = ArrayList<ItemsTypes>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val layout = when (viewType) {
            VIEW_HEADER -> R.layout.item_header_time
            VIEW_CONTACT -> R.layout.item_contact
            else -> 0
        }
        return DataViewHolder(LayoutInflater.from(parent.context).inflate(layout, parent, false))
    }


    @SuppressLint("NotifyDataSetChanged")
    fun setItems(data: List<ItemsTypes>) {
        dataList.apply {
            clear()
            addAll(data)
        }
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }


    override fun getItemViewType(position: Int): Int {
        return when (dataList[position]) {
            is ItemsTypes.ItemContact -> VIEW_CONTACT
            is ItemsTypes.ItemHeader ->  VIEW_HEADER
        }
    }


    companion object {
        const val VIEW_HEADER = 0
        const val VIEW_CONTACT = 1
    }
}