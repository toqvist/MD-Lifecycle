package com.toqvist.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.formUsername)
        val password = findViewById<EditText>(R.id.formPassword)

        val loginButton = findViewById<Button>(R.id.buttonLogin)

        loginButton.setOnClickListener {
            if (username.text.toString() == "test" && password.text.toString() == "password") {
                val goToForms = Intent(this, Forms::class.java)
                startActivity(goToForms)
            }

            else {
                val toast = Toast.makeText(this, "Login failed", Toast.LENGTH_LONG)
                toast.show()
            }

        }
    }
}