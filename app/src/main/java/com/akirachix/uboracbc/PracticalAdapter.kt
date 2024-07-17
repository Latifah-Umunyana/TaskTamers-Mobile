package com.akirachix.uboracbc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PracticalAdapter (var practicalList: List<Practical>): RecyclerView.Adapter<PracticalViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PracticalViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.practical_list_item, parent, false)
        return PracticalViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PracticalViewHolder, position: Int) {
var practical = practicalList[position]
        holder.tvCategory.text = practical.category
        holder.tvActivityName.text = practical.activityName
        holder.tvCategory2.text = practical.category2
        holder.tvActivityName2.text = practical.activityName2
    }

    override fun getItemCount(): Int {
  return practicalList.size
    }
}

class PracticalViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

var tvCategory = itemView.findViewById<TextView>(R.id.tvCategory)
    var tvActivityName = itemView.findViewById<TextView>(R.id.tvActivityName)
    var tvCategory2 = itemView.findViewById<TextView>(R.id.tvCategory2)
    var tvActivityName2 = itemView.findViewById<TextView>(R.id.tvActivityName2)

}