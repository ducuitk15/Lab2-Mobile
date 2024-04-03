package com.example.ex4_lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var projectEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khởi tạo các view
        nameEditText = findViewById(R.id.nameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        projectEditText = findViewById(R.id.projectEditText)
        val viewInfoButton: Button = findViewById(R.id.viewInfoButton)

        // Xử lý sự kiện khi nhấn nút "View Context Information"
        viewInfoButton.setOnClickListener {
            displayInformation()
        }
    }

    // Phương thức này hiển thị thông tin đã nhập bằng cách chuyển đến activity mới
    private fun displayInformation() {
        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()
        val project = projectEditText.text.toString()

        val intent = Intent(this, DisplayInformationActivity::class.java).apply {
            putExtra("name", name)
            putExtra("email", email)
            putExtra("project", project)
        }
        startActivity(intent)
    }
}