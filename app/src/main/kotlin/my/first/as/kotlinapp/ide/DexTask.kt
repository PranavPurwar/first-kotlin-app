package my.first.`as`.kotlinapp.ide

import com.pranav.ide.dx.command.dexer.Main

import java.io.File
import java.util.List
import java.lang.reflect.Method

class DexTask {

fun doFullTask() {
        val f = File("/storage/emulated/0/classesTest.jar")
		val args: List<String> = Arrays.asList(
		"--debug",
		"--verbose",
		"--min-sdk-version=21",
		"--output=" + f.getParent(),
		f.getAbsolutePath()
		)
		Main.clearInternTables()
		val arguments: Main.Arguments = Main.Arguments()
		parseMethod: Method = (Main.Arguments::class).getDeclaredMethod("parse", String::class[])
		parseMethod.isAccessible = true
		parseMethod.invoke(arguments, (Object) args.toArray(String[0]))
		Main.run(arguments)
}

}