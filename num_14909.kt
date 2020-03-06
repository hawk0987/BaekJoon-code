import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var count = 0
    var N = nextLine()
    var n = N.split(" ")
    for(i in n.indices){
        if(n[i].toInt()>0){
            count++
        }
    }

    print(count)
}