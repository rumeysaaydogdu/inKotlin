package com.rumeysa.theoffice

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val theofficeListesi : ArrayList<String>, val theofficeGorselleri : ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.TheOfficeVH>() {

    class TheOfficeVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TheOfficeVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return TheOfficeVH(itemView)
    }

    override fun onBindViewHolder(holder: TheOfficeVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = theofficeListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("officedekilerinIsmi",theofficeListesi.get(position))

            val singleton = SingletonClass.secilenOfficeCalisani
            singleton.gorsel = theofficeGorselleri.get(position)

            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return theofficeListesi.size
    }
}