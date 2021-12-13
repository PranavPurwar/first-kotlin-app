package my.first.`as`.kotlinapp.ide

import com.pranav.ide.dx.command.dexer.Main

import java.io.File
import java.lang.reflect.Method

class DexTask {

fun doFullTask() {
        val f = File("/storage/emulated/0/classesTest.jar")
		List<String> args = Arrays.asList(
		"--debug",
		"--verbose",
		"--min-sdk-version=21",
		"--output=" + f.getParent(),
		input
		)
		Main.clearInternTables()
		val arguments = Main.Arguments()
		parseMethod: Method = Main.Arguments::class.getDeclaredMethod("parse", String[]::class)
		parseMethod.isAccessible = true
		parseMethod.invoke(arguments, (Object) args.toArray(String[0]))
		Main.run(arguments)
}

}