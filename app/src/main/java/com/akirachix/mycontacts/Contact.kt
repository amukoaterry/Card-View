package com.akirachix.mycontacts

import android.provider.ContactsContract.CommonDataKinds.Email

data class Contact(
    var Name: String,
    var phoneNumber: String,
    var email: String,
    var avatar: String
)
