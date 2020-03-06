import java.util.*
fun main()= with(Scanner(System.`in`)){
    var n = nextInt()
    var ary = Array<Int>(n+1,{0})
    if(n>=1){
        ary[1] = 1
        for(i in 2..n){
            ary[i] = ary[i-1] + ary[i-2]
        }
    }
    print(ary[n])
}