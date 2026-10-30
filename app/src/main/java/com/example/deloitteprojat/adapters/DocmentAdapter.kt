package com.example.deloitteprojat.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.deloitteprojat.R
import com.example.deloitteprojat.model.Document
//import com.example.deloitteprojat.models.Document

class DocumentAdapter(
    private val documentList: List<Document>
) : RecyclerView.Adapter<DocumentAdapter.DocumentViewHolder>() {

    class DocumentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgIcon: ImageView = itemView.findViewById(R.id.imgIcon)
        val txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
        val txtCount: TextView = itemView.findViewById(R.id.txtCount)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DocumentViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.docment_apdater, parent, false)

        return DocumentViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: DocumentViewHolder,
        position: Int
    ) {
        val document = documentList[position]

        holder.txtTitle.text = document.title
        holder.txtCount.text = document.fileCount

        holder.imgIcon.setImageResource(document.icon)
    }

    override fun getItemCount(): Int {
        return documentList.size
    }
}