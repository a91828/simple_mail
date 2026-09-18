package com.example.simple_mail

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class EmailFetcher {
    companion object {
        val senders = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        val title = "Welcome to Kotlin!"
        val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."
        var read = false

        val calendar = Calendar.getInstance()
        val df = SimpleDateFormat("MM/dd/yyyy", Locale.getDefault())
        val date: String = df.format(calendar.time)

        fun getEmails(): MutableList<Email> {
            var emails : MutableList<Email> = ArrayList()
            for (i in 0..9) {
                val email = Email(senders[i], title, summary, read, date)
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            var newEmails : MutableList<Email> = ArrayList()
            for (i in 10..14) {
                val email = Email(senders[i], title, summary, read, date)
                newEmails.add(email)
            }
            return newEmails
        }
    }
}