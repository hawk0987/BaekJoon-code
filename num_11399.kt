import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var N = nextInt()
    var P = Array<Int>(N,{0})
    var sum = 0
    var total = 0

    for(i in 1..N){
        P[i-1] = nextInt()
    }
    P.sort()
    for(i in 0..N-1){
        sum += P[i]
        total += sum
    }

    print(total)
}