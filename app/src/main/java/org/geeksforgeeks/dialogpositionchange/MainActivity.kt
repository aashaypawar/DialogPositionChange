package org.geeksforgeeks.dialogpositionchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing a constant for Button from the layout file (activity_main.xml)
        val mButton1 = findViewById<Button>(R.id.button_1)

        // Declaring and initializing a constant for AlertDialog Builder
        val mBuilder = AlertDialog.Builder(this)

        // Attributing the AlertDialog Builder
        mBuilder.setTitle("TITLE")
            .setMessage("MESSAGE")
            .setPositiveButton("Positive"){_,_->}
            .setNegativeButton("Negative"){_,_->}

        // On Button click, AlertDialog is created and displayed.
        // Gravity of the AlertDialog is attributed.
        mButton1.setOnClickListener {
            val mAlert = mBuilder.create()
            mAlert.show()
            mAlert.window?.setGravity(Gravity.TOP)
        }
    }
}