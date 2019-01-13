package com.anubhav87.mvvmtutorial.adapter


import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anubhav87.mvvmtutorial.R
import com.anubhav87.mvvmtutorial.db.entity.Note

 class NoteAdapter : RecyclerView.Adapter<NoteAdapter.NoteHolder>() {
    private var notes: List<Note> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_item, parent, false)
        return NoteHolder(itemView)
    }

    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        val currentNote = notes[position]
        holder.textViewTitle.text = currentNote.title
        holder.textViewDescription.text = currentNote.description
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    fun setNotes(notes: List<Note>) {
        this.notes = notes
        notifyDataSetChanged()
    }

    inner class NoteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewTitle: TextView = itemView.findViewById(R.id.text_view_title)
        var textViewDescription: TextView = itemView.findViewById(R.id.text_view_description)

    }
}