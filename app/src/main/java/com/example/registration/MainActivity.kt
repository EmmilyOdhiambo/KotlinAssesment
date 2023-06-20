package com.example.registration

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.registration.databinding.ActivityRegistrationBinding

//import com.example.registration.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
   private lateinit var binding:ActivityRegistrationBinding

//    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val etUsername: EditText = binding.etUsername
        val etPhoneNumber: EditText = binding.etPhoneNumber
        val etEmailAddress: EditText = binding.etEmailAddress
        val etPassword: EditText = binding.etPassword
        val btnRegister: Button = binding.btnRegister

        btnRegister.setOnClickListener {
            // Perform form validation and registration logic here
            val username = etUsername.text.toString()
            val phoneNumber = etPhoneNumber.text.toString()
            val emailAddress = etEmailAddress.text.toString()
            val password = etPassword.text.toString()

        }
    }
}






