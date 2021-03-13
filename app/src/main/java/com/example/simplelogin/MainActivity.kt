package com.example.simplelogin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            if (email.text.toString().isEmpty() && pass.text.toString().isEmpty()) {
                    fieldChecker.visibility= View.VISIBLE
            }
            else {
                fieldChecker.visibility= View.GONE
                btn.isEnabled=true
                Toast.makeText(this, "Ready to Go !", Toast.LENGTH_LONG).show()
            }
        }

        forgotUP.setOnClickListener{
            Toast.makeText(this,"Forget Username or Password !!",Toast.LENGTH_SHORT).show()
        }
    }
}