package my.first.`as`.kotlinapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import my.first.`as`.kotlinapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import my.first.`as`.kotlinapp.ide.task.java.DexTask
import my.first.`as`.kotlinapp.ide.Task

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.v("tag", "Verbose")
        binding.button.setOnClickListener {
            Snackbar.make(this, binding.root, "Run dx", Snackbar.LENGTH_INDEFINITE)
                .setAction("Button", {
                    Toast.makeText(this, "Starting", Toast.LENGTH_LONG).show()
                    val task: DexTask = DexTask("/storage/emulated/0/classesTest.jar")
                    Toast.makeText(this, task.getTaskName(), Toast.LENGTH_LONG).show()
                    task.doFullTask();
                }).show()
                
        }
    }
}
