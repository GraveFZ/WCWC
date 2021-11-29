package com.example.test

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    lateinit var btnSignUp: Button
    lateinit var edEmail: EditText
    lateinit var edPassword: EditText
    lateinit var edFirstName: EditText
    lateinit var edSecName: EditText
    lateinit var edRePassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnSignInGo: Button = findViewById(R.id.btnSignInGo)
        btnSignUp = findViewById(R.id.btnRegisterNow)
        edEmail = findViewById(R.id.etEmail)
        edPassword = findViewById(R.id.etPasswordReg)
        edRePassword = findViewById(R.id.etPasswordReg2)
        edFirstName = findViewById(R.id.etName)
        edSecName = findViewById(R.id.etSurname)

        // Нажатие кнопки "У меня уже есть аккаунт" и переход в окно Входа
        btnSignInGo.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
