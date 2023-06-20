package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        castViews()

//        binding.tvLogin = findViewById(R.id.tvLogin)
//        binding.tvLogin.setOnClickListener {
//            val intent = Intent(this, loginactivity::class.java)
//            startActivity(intent)
//        }

    }

    override fun onResume() {
        super.onResume()
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)

        }
        binding.tvLogin.setOnClickListener {
            validateLogin()
        }

    }

//    fun castViews() {
//        tvLogin = findViewById(R.id.tvLogin)
//        tilFirstName = findViewById(R.id.tilFirstName)
//        tilLastName = findViewById(R.id.tilLastName)
//        tilEmail = findViewById(R.id.tilEmail)
//        tilPassword = findViewById(R.id.tilPassword)
//        tilConfirmationPassword = findViewById(R.id.tilConfirmPassword)
//        etEmail = findViewById(R.id.etEmail)
//        etFirstName = findViewById(R.id.etFirstName)
//        etLastName = findViewById(R.id.etLastName)
//        etPassword = findViewById(R.id.etPassword)
//        etConfirmationPassword = findViewById(R.id.etConfirmationPassword)
//
//    }

    fun validateLogin(){
        binding.tilFirstName.error = null
        val firstName = binding.etFirstName.text.toString()
        val lastName = binding.etLastName.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        val confirmationPassword = binding.etConfirmationPassword.text.toString()
        var error = false

        if(firstName.isBlank()){
            binding.tilFirstName.error = "First name required"
            error = true
        }
        if(lastName.isBlank()){
            binding.tilPhonenumber.error = "Phone number required"
            error = true
        }
        if(password.isBlank()){
            binding.tilPassword.error = "Password required"
            error = true
        }
        if(email.isBlank()){
            binding.tilEmail.error = "Email required"
            error = true
        }
        if(confirmationPassword.isBlank()){
            binding.tilConfirmPassword.error = "ConfirmationPassword required"
            error = true
        }
        if(password !=confirmationPassword){
            binding.tilConfirmPassword.error = "confirmation Password does not match the password"
            error = true
        }
        if(!error){
            Toast.makeText(this,"$firstName $lastName $email",Toast.LENGTH_LONG)
                .show()
        }
    }

}
