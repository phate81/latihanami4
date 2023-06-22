package com.example.latihanami4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.latihanami4.databinding.ActivityProfilAmiBinding

class profil_ami : AppCompatActivity() {
    lateinit var binding: ActivityProfilAmiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilAmiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnbinding.setOnClickListener {
            Toast.makeText(this, "menggunakan binding pak", Toast.LENGTH_LONG).show()
        }
    }
}