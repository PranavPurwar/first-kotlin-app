package my.first.`as`.kotlinapp

import android.os.Application
import android.content.Context
import android.util.Log
import android.widget.Toast

class ApplicationLoader: Application() {

    companion object {
        lateinit val context: ApplicationLoader
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        Thread.setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler() {
			fun uncaughtException(thread: Thread, throwable: Throwable) {
                Toast.makeText(this, Log.getStackTraceString(throwable), Toast.LENGTH_SHORT).show()
            }
        })
    }
    
    fun getContext(): Context {
        return context
    }
}