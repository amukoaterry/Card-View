package com.akirachix.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        displayContacts()
    }

    fun displayContacts(){
        val contact1 = Contact("Anna","0721238382","anne@gmail.com","")
        val contact2 = Contact("Zippy","0738638237","zippy@gmail.com","")
        val contact3 = Contact("Terry","07082983732","Terry@gmail.com","")
        val contact4 = Contact("Mitchell","07682379193","mitch@gmail.com","")
        val contact5 = Contact("Pinkie","0721297298","pinkie@gmail.com","")
        val contact6 = Contact("Wato","0721238332","wato@gmail.com","")
        val contact7 = Contact("Casey","0721238382","casey@gmail.com","")
        val contact9 = Contact("Minu","0728619272","minu@gmail.com","")
        val contact10 = Contact("Ochieng","0721782382","ochieng@gmail.com","")

        val contactList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact9,contact10)
        val contactsAdapter = ContactsAdapter(contactList)
        binding.rvContacts.adapter = contactsAdapter
    }

}