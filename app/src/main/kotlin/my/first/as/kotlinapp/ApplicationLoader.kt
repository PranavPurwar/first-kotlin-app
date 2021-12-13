package my.first.`as`.kotlinapp

import android.os.Application
import android.content.Context
import android.util.Log
import android.widget.Toast

class ApplicationLoader: Application() {

    var context: Context?

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        context = base
    }
    
    override fun onCreate() {
        Thread.setDefaultUncaughtExceptionHandler(thread, throwable -> {
            Toast.makeText(context, Log.getStackTraceString(throwable), Toast.LENGTH_SHORT).show()
        })
    }
    
    fun getContext(): Context {
        return context
    }
}