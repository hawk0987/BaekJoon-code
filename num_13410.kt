import java.util.*
fun main()= with((Scanner(System.`in`))) {
    var N = nextInt()
    var K = nextInt()
    var ary = Array<Int>(K,{0})

    for(i in 1..K){
        var num = (N*i).toString()
        var Num = num.reversed()



        ary[i-1] = Num.toInt()
    }
    ary.sort()

    print(ary[K-1])
}