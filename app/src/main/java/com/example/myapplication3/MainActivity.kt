package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.clickButton.setOnClickListener {
            Toast.makeText(this,"누름",Toast.LENGTH_SHORT).show()
            binding.textView.text="버튼을 누름"
            binding.ivIcon.setImageResource(R.drawable.ic_launcher_foreground)
        }




    }
}