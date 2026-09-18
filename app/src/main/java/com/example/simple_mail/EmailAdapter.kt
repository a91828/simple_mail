package com.example.simple_mail
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter (private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.ViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val email = emails.get(position)
        val sender = holder.senderTextView
        val title = holder.titleTextView
        val summary = holder.summaryTextView

        if(!email.read) {
            sender.setTypeface(sender.typeface, Typeface.BOLD)
            title.setTypeface(title.typeface, Typeface.BOLD)
            summary.setTypeface(title.typeface, Typeface.BOLD)
        }

        sender.text = email.sender
        title.text = email.title
        summary.text = email.summary
        holder.

    }

    override fun getItemCount(): Int {
        return emails.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderTextView: TextView
        val titleTextView: TextView
        val summaryTextView: TextView

        init {
            senderTextView = itemView.findViewById(R.id.senderTv)
            titleTextView = itemView.findViewById(R.id.titleTv)
            summaryTextView = itemView.findViewById(R.id.summaryTv)
        }
    }
}

