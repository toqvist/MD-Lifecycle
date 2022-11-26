package com.toqvist.lifecycle

import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.toqvist.lifecycle.databinding.ActivityFormsBinding

class Forms : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forms)

        val nameForm = findViewById<EditText>(R.id.nameForm)
        val ageForm = findViewById<EditText>(R.id.ageForm)
        val cookingRating = findViewById<RatingBar>(R.id.cookingRating)

        val aliveRadioGroup = findViewById<RadioGroup>(R.id.radioGroupAlive)
        var aliveRadio = findViewById<RadioButton>(aliveRadioGroup.checkedRadioButtonId)

        val goGetter = findViewById<CheckBox>(R.id.checkboxGoGetter)
        val hardWorking = findViewById<CheckBox>(R.id.checkboxHardWorking)
        val servileAttitude = findViewById<CheckBox>(R.id.checkboxServileAttitude)
        val teamPlayer = findViewById<CheckBox>(R.id.checkboxTeamPlayer)

        val submitButton = findViewById<Button>(R.id.buttonSubmit)
        val logoutButton = findViewById<Button>(R.id.buttonLogout)


        submitButton.setOnClickListener{

            val userObject = object {
                val name = nameForm.text.toString()
                val age = ageForm.text.toString()
                val cookingSkill = cookingRating.toString()
                val alive = aliveRadio?.text.toString()
                val traits = arrayOf(goGetter, hardWorking, servileAttitude, teamPlayer)
            }

            val toast = Toast.makeText(this, "Submitted!", Toast.LENGTH_LONG)
            toast.show()
        }


        logoutButton.setOnClickListener{
            val goToLogin = Intent(this, MainActivity::class.java)
            startActivity(goToLogin)
        }


    }
}