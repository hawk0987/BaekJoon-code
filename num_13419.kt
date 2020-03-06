import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var T =  nextInt()

    for(i in 1..T){
        var S = next()

        if(S.length%2==0){
            for(i in 0..S.length-1 step 2){
                print(S[i])
            }
            println()
            for(i in 1..S.length-1 step 2){
                print(S[i])
            }
        }

        else if(S.length%2==1){
            for(i in 0..S.length-1 step 2){
                print(S[i])
            }
            for(i in 1..S.length-1 step 2){
                print(S[i])
            }
            println()
            for(i in 1..S.length-1 step 2){
                print(S[i])
            }
            for(i in 0..S.length-1 step 2){
                print(S[i])
            }
        }
        println()
    }
}