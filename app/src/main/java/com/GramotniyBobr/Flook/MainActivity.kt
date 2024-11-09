package com.GramotniyBobr.Flook

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.GramotniyBobr.Flook.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.TopToolBar.setOnMenuItemClickListener {
            Tost()
            true
        }
        binding.TopToolBar.setNavigationOnClickListener {
            Tost()
        }
        binding.botContainer.setOnClickListener {
            Tost()
         //   var name : String = this.binding.toString()
        }
    }

    fun Tost() {//name :String
        Toast.makeText(this, "Текст в разработке", Toast.LENGTH_SHORT).show()
    }
}