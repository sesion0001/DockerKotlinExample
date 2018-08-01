fun main(args: Array<String>) {
    
    val env = System.getenv("NUM") //String?
    val miNum = env.toIntOrNull() ?: -1

    val numerosTabla =
        listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // List<Int>
 
    numerosTabla
    .map {it -> "$it x $miNum = ${it*miNum}" }// List<String>
    .map { it -> println(it) }

}

