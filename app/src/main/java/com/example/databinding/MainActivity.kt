package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}