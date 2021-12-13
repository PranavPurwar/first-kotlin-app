package my.first.`as`.kotlinapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
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
            Snackbar.make(this, binding.root, "Run dx", Snackbar.LENGTH_SHORT)
                .setAction("Button", {
                    Toast.makeText(this, "Starting", Snackbar.LENGTH_LONG).show()
                    val tasks: Array<Task> = arrayOf(
                        DexTask("/storage/emulated/0/classesTest.jar")
                    )
                    for (Task task : tasks) {
                        Toast.makeText(this, "Task name: " + task.getTaskName(), Toast.LENGTH_SHORT).show()
                        runTask()
                        suspend fun runTask() {
                        task.doFullTask();
                        }
                    }
                }).show()
                
        }
    }
}
