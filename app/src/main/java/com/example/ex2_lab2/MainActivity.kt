package com.example.ex2_lab2

import android.graphics.Color
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorRadioGroup: RadioGroup = findViewById(R.id.colorRadioGroup)
        colorRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton: RadioButton = findViewById(checkedId)
            val colorName = selectedRadioButton.text.toString()
            changeBackgroundColor(colorName)
        }
    }

    private fun changeBackgroundColor(colorName: String) {
        val color: Int = when (colorName) {
            "Red" -> Color.RED
            "Blue" -> Color.BLUE
            "Green" -> Color.GREEN
            "Grey" -> Color.GRAY
            else -> Color.WHITE // Default color
        }
        val rootView = findViewById<View>(android.R.id.content)
        rootView.setBackgroundColor(color)
    }


}