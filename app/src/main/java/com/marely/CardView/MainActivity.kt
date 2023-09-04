package com.desafiolatam.desafio3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.desafiolatam.desafio3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , BaseListener{

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Puedes ocupar este ejemplo para navegar entre activities
        binding.cardView1.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        binding.cardView2.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        binding.cardView3.setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))
        }

        binding.cardView4.setOnClickListener {
            startActivity(Intent(this, FifthActivity::class.java))
        }

        binding.cardView5.setOnClickListener {
            startActivity(Intent(this, SixthActivity::class.java))
        }

        binding.cardView6.setOnClickListener {
            startActivity(Intent(this, SeventhActivity::class.java))
        }

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")

    }
}