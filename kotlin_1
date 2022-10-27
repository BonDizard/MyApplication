package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MYTAG","MainActivity : OnCreate")
        val greetingTextView = findViewById<TextView>(R.id.Name)
        val inputField = findViewById<EditText>(R.id.Noob)
        val submitButton = findViewById<Button>(R.id.bts)
        val OffersButton = findViewById<Button>(R.id.btnOffers)
        var enterName = ""
        submitButton.setOnClickListener {
            enterName = inputField.text.toString()
            if (enterName == "") {
                OffersButton.visibility = INVISIBLE
                greetingTextView.text = ""
                Toast.makeText(
                    this@MainActivity,
                    "Mfs enter your name",
                    Toast.LENGTH_SHORT
                ).show()
            } else {


                val message = "Welcome Noob $enterName"
                greetingTextView.text = message
                inputField.text.clear()
                OffersButton.visibility = VISIBLE
            }

        }



        OffersButton.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("USER",enterName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG","MainActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","MainActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","MainActivity : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","MainActivity : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","MainActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","MainActivity : OnRestart")
    }
}
