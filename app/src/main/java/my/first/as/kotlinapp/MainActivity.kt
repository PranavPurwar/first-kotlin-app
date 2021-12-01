package my.first.`as`.kotlinapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import my.first.`as`.kotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        textView = binding.test
        textView.text = "View DataBinding Test"
        Log.v("tag", "Verbose")
        Toast.makeText(this, "Toast Example In Kotlin", Toast.LENGTH_SHORT).show()
    }
}
