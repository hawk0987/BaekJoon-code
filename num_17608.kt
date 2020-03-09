import java.util.*
fun main()=with(Scanner(System.`in`)){
    var N = nextInt()
    var h = Array<Int>(N,{0})
    var count = 0
    for(i in 0..N-1){
        h[i] = nextInt()
    }
    var max = h[N-1]

        for(i in 1..N-1){
        if(h[N-(i+1)]>max){
            count++
            max = h[N-(i+1)]
        }
    }
    print(count+1)
}