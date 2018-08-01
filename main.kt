fun main(args: Array<String>) {
    
    val envVar = System.getenv("NUM2")?.toIntOrNull() // Int?

    val result = envVar?.let { Success(it) } ?: Error("No existe variable")
    
    when(result){
        is Error -> println("No jalo -> ${result.msg}")
        is Success -> println("Jaló ${result.number}")
    }
    
    println("Corri :)")    
}

sealed class Result
class Success(val number:Int): Result()
class Error(val msg:String): Result()

