import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var N = nextInt()
    nextLine()
    for(i in 1..N){
        var s = nextLine()
        if(s[0]>=97.toChar() && s[0]<=122.toChar()){
            print(s[0].toChar()-32)
            for(j in 1..s.length-1){
                print(s[j])
            }
            println()
        }else{
            println(s)
        }
    }
}