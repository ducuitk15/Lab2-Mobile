package com.example.ex1_lab2

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFile = findViewById<Button>(R.id.button_file)
        val buttonEdit = findViewById<Button>(R.id.button_edit)

        registerForContextMenu(buttonFile)
        registerForContextMenu(buttonEdit)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        when (v?.id) {
            R.id.button_file -> menuInflater.inflate(R.menu.context_menu_file, menu)
            R.id.button_edit -> menuInflater.inflate(R.menu.context_menu_edit, menu)
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_new -> {
                showToast("New selected")
                true
            }
            R.id.menu_save -> {
                showToast("Save selected")
                true
            }
            R.id.menu_load -> {
                showToast("Load selected")
                true
            }
            R.id.menu_exit -> {
                showToast("Exit selected")
                true
            }
            R.id.menu_cut -> {
                showToast("Cut selected")
                true
            }
            R.id.menu_copy -> {
                showToast("Copy selected")
                true
            }
            R.id.menu_paste -> {
                showToast("Paste selected")
                true
            }
            R.id.menu_delete -> {
                showToast("Delete selected")
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun onFileButtonClick(view: View) {
        openContextMenu(view)
    }

    fun onEditButtonClick(view: View) {
        openContextMenu(view)
    }

    fun onViewButtonClick(view: View) {
        // Handle View button click
    }

    fun onToolButtonClick(view: View) {
        // Handle Tool button click
    }
}