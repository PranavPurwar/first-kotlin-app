package my.first.`as`.kotlinapp.ide

import com.pranav.ide.dx.command.dexer.Main

import java.io.File
import java.util.List
import java.lang.reflect.Method
import java.util.Arrays

class DexTask {

    fun doFullTask() {
        val f = File("/storage/emulated/0/classesTest.jar")
		val args = Arrays.asList(
		"--debug",
		"--verbose",
		"--min-sdk-version=21",
		"--output=" + f.getParent(),
		f.getAbsolutePath()
		)
		Main.clearInternTables()
		val arguments: Main.Arguments = Main.Arguments()
		var parseMethod: Method = ((class) Main.Arguments::class).getDeclaredMethod("parse", Array<String>::class.java)
		parseMethod.isAccessible = true
		parseMethod.invoke(arguments, args.toTypedArray())
		Main.run(arguments)
    }

}