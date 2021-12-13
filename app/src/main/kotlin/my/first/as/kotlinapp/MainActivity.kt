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
        val crashButton = Button(this)
        crashButton.text = "Test Crash"
        crashButton.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }

       addContentView(crashButton, ViewGroup.LayoutParams(
           ViewGroup.LayoutParams.MATCH_PARENT,
           ViewGroup.LayoutParams.WRAP_CONTENT))
/*        setContentView(binding.root)
        Log.v("tag", "Verbose")
        binding.button.setOnClickListener {
            Snackbar.make(this, binding.root, "Run dx", Snackbar.LENGTH_SHORT)
                .setAction("Button", {
                    Toast.makeText(this, "Starting", Snackbar.LENGTH_LONG).show()
                    throw RuntimeException("Test Crash")
                    val tasks: Array<Task> = arrayOf(
                        val task: DexTask = DexTask("/storage/emulated/0/classesTest.jar")
                        task.doFullTask();
                    )
                    for (task in tasks) {
                        Toast.makeText(this, "Task name: " + task.getTaskName(), Toast.LENGTH_SHORT).show()
                        task.doFullTask();
                    }
                }).show()
                
*/        }
    }
}
