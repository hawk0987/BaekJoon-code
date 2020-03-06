import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var N = nextInt()
    var M = nextInt()
    var ary = Array<CharArray>(N,{CharArray(M)})

    if(N!=0 && M!=0){

        for(i in 0..N-1){
            var fish = next()
            for(j in 0..M-1){
                ary[i][j] = fish[j]
            }
        }

        for(i in 0..N-1){
            ary[i].reverse()
            println(ary[i])
        }
    }
}