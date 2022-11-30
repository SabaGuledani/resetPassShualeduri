package com.example.shualeduri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    private lateinit var phone:EditText
    private lateinit var sms:EditText
    private lateinit var pass:EditText
    private lateinit var repeat:EditText
    private lateinit var reset:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        phone = findViewById(R.id.phonenumber)
        sms = findViewById(R.id.sms)
        pass = findViewById(R.id.password)
        repeat = findViewById(R.id.reppas)
        reset = findViewById(R.id.button)

        reset.setOnClickListener {
            if(phone.text.toString().isDigitsOnly() && phone.text.toString()[0].toString() == "5" &&
                        phone.text.toString().length == 9 && sms.text.toString().length == 4 &&
                    sms.text.isDigitsOnly() && pass.text.toString() == repeat.text.toString() &&
                    pass.text.toString() != "" && repeat.text.toString() != ""){
                Toast.makeText(this, "შეამოწმეთ email", Toast.LENGTH_SHORT).show()
            }
        }
    }
}