package br.com.ioasys.ioasys_books.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.ioasys_books.R
import br.com.ioasys.ioasys_books.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}