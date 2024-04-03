package com.example.ex4_lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayInformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_information)

        val displayTextView: TextView = findViewById(R.id.displayTextView)
        val backToInputButton: Button = findViewById(R.id.backToInputButton)

        // Nhận dữ liệu từ Intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val project = intent.getStringExtra("project")

        // Hiển thị thông tin
        val information = "Name: $name\nEmail: $email\nProject: $project"
        displayTextView.text = information

        // Phóng to TextView
        displayTextView.textSize = 24f

        // Xử lý sự kiện khi nhấn nút "Back to Input Screen"
        backToInputButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Kết thúc activity hiện tại để không trở lại được khi nhấn nút back
        }
    }
}