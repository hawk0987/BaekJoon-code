import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var T = nextInt()
    for(i in 1..T){
        var s = next()
        var A = s.split(",")[0].toInt()
        var B = s.split(",")[1].toInt()
        println(A+B)
    }
}