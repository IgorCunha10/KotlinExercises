package exercises.level_5five.ex_twentytwo

import java.io.File

class CountLines {

    fun countLines(filepath: String): Int {
        println("O número de linhas no arquivo enviado é:")
        return File(filepath).useLines { it.count() }
    }

}