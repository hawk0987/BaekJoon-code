import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var T = nextInt()
    for(i in 1..T){

        var N = nextInt()
        var M = nextInt()
        var count = 0
        var real = false
        var seat = Array<IntArray>(N,{IntArray(M)})
        for(i in 0..N-1){
            for(j in 0..M-1){
                count++
                if(i==11 && j==3){
                    real = true
                    println(count)
                    break
                }
            }
        }
        if(real==false){
            println(-1)
        }

    }
}