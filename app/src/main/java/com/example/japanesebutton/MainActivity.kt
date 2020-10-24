package com.example.japanesebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Toast.makeText(this,resources.getString(R.string.toast_message),Toast.LENGTH_LONG).show()
        }
        button2.setOnClickListener {
            val message:String=msg.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()
        }

    }
}