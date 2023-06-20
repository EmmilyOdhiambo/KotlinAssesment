package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.registration_form.R
import com.example.registration_form.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnAdd.setOnClickListener {
            validateLogin()
        }

    }
    fun validateLogin(){
        binding.tillUserName.error = null
        val username = binding.etUserName.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        var error = false

        if(username.isBlank()){
            binding.tillUserName.error = "User name required"
            error = true
        }
        if(password.isBlank()){
            binding.tilPassword.error = "Phone number required"
            error = true
        }

        if(email.isBlank()){
            binding.tilEmail.error = "Email required"
            error = true
        }
        if(!error){
            Toast.makeText(this,"$username $password $email", Toast.LENGTH_LONG)
                .show()
        }
    }

}

