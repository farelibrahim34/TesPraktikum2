package com.example.tespraktikum

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tespraktikum.databinding.ActivityMenuAlgoritmaBinding

class MenuAlgoritma : AppCompatActivity() {
    lateinit var binding : ActivityMenuAlgoritmaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuAlgoritmaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numbers = intArrayOf(5,4,1,6,8,9,7,6,3,8,10)
        val filter = numbers.filter { it > 6 }

        binding.jawabanAlgoritma.setOnClickListener {
            println(filter)
        }
        }
    }
