package com.akirachix.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.mycontacts.databinding.ContactListItemBinding

class ContactsAdapter(var contactsList: List<Contact>):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val bindiing = ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(bindiing)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.bindiing.tvName.text = contact.Name
        holder.bindiing.tvPhoneNUmber.text = contact.phoneNumber
        holder.bindiing.tvEmail.text = contact.email
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactsViewHolder(var bindiing:ContactListItemBinding):RecyclerView.ViewHolder(bindiing.root){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvphoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNUmber)
    val tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)

}

