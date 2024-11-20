package com.example.testapplication

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel: DataViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.Amount(binding.amount.text.toString())
        viewModel.amount.observe(this) { amount ->
           if (amount){
             binding.numberLayout4.visibility= View.VISIBLE
           }
            else{
               binding.numberLayout4.visibility= View.GONE
           }
        }
    }
}
