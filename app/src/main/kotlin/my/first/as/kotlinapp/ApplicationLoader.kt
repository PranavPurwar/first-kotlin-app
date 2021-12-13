package my.first.`as`.kotlinapp

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast

class ApplicationLoader: Application() {

    companion object {
        lateinit var context: ApplicationLoader
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        Thread.setDefaultUncaughtExceptionHandler({
			fun uncaughtException(thread: Thread, throwable: Throwable) {
                Toast.makeText(this, Log.getStackTraceString(throwable), Toast.LENGTH_SHORT).show()
            }
        })
    }
    
    fun getContext(): Context {
        return context
    }
}