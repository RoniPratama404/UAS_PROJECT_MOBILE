package com.stmik.roninews


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ListBookAdapter(private val listBook: List<Book>) :
RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {
    var clickListener : RecyclerViewClickListener? = null
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.catalog_row, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int  = listBook.size


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        val (name, description, photo) = listBook[position]
        Glide.with(holder.itemView.context)
            .load(photo) // URL Gambar
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDescription.text = description

        holder.itemView.setOnClickListener {
            clickListener?.onItemClickListener(it, listBook[position])
        }


    }


}