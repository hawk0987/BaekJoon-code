import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var n = nextInt()
    var count = 0
    while(count<10000){
        var num = nextInt()

        if(num==0){
            break
        }
        if(num%n==0){
            println("$num is a multiple of $n.")
        }else{
            println("$num is NOT a multiple of $n.")
        }
        count++

    }
}