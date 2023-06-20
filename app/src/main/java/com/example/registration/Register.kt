package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registration_form.R
import com.example.registration_form.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnSignup.setOnClickListener {
            registration()
        }
    }
    fun  registration(){
        val username = binding.etUsername.text.toString()
        val phoneNumber = binding.etPhonenumber.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        var error = false
        if (username.isBlank()) {
            binding.tilUsername.error = "Name required"
            error=true
        }
        if (phoneNumber.isBlank()) {
            binding.tilPhonenumber.error = "Phonenumber required"
            error=true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email required"
            error=true
        }

        if (password.isBlank()) {
            binding.tilPassword.error = "Password required"
            error=true
        }

        if (!error){
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}
