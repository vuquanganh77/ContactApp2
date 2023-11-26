package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_contact_menu -> {
                val navController = findNavController(R.id.nav_host_fragment)
                navController.navigate(R.id.nav_new_contact)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object {
        val contactList: MutableList<Contact> = mutableListOf<Contact>(
            Contact("Ja Morant", "555-555-5555", "jamorant@gmail.com", 1),
            Contact("Lebron James", "123-456-7890", "lebronjames@example.com", 2),
            Contact("Steph Curry", "987-654-3210", "stephcurry@example.com", 3),
            Contact("Kyrie Irving", "111-222-3333", "kyrieirving@example.com", 4),
            Contact("Donovan Mitchell", "999-888-7777", "donovanmitchell@example.com", 5),
            Contact("Anthony Davis", "444-333-2222", "anthonydavis@example.com", 6),
            Contact("Tyler Herro", "777-666-5555", "tylerherro@example.com", 7),
            Contact("Jalen Green", "333-444-5555", "jalengreen@example.com", 8),
            Contact("Derrick Rose", "666-555-4444", "derrickrose@example.com", 9),
            Contact("Russell Westbrook", "222-333-4444", "russellwestbrook@example.com", 10)
        )
    }
}