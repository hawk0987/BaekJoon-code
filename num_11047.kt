import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var N = nextInt()
    var K = nextInt()
    var A = Array<Int>(N,{0})
    var count = 0

    for(i in 1..N){
        A[i-1] = nextInt()
    }

    for(i in N downTo 1){
        if(K==0){
            break
        }
        count += K/A[i-1]
        K = K%A[i-1]
    }

    print(count)


}