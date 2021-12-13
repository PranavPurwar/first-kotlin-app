package my.first.`as`.kotlinapp.ide.task.java

import com.pranav.ide.dx.command.dexer.Main

import my.first.`as`.kotlinapp.ide.Task

import java.io.File
import kotlin.collections.List
import java.lang.reflect.Method

class DexTask: Task {

    private val input: String

    constructor(path: String) {
        input = path
    }

    override fun getTaskName(): String = "DexTask"

    override fun doFullTask() {
        val f = File(input)
        val args: Array<String> = arrayOf(
            "--debug",
            "--verbose",
            "--min-sdk-version=21",
            "--output=" + f.getParent(),
            input
        )
        Main.clearInternTables()
        val arguments: Main.Arguments = Main.Arguments()
        val parseMethod: Method = Main.Arguments::class.java.getDeclaredMethod("parse", Array<String>::class.java)
        parseMethod.isAccessible = true
        parseMethod.invoke(arguments, args)
        Main.run(arguments)
    }

}