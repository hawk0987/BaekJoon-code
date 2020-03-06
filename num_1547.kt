import java.util.*;
fun main() {
    val scan = Scanner(System.`in`)
    var M = scan.nextInt()
    var ball = 1
    for(i in 1..M){
        var X = scan.nextInt()
        var Y = scan.nextInt()

        if(X==ball){
            ball = Y
        }
        else if(Y==ball){
            ball = X
        }
    }
    print(ball)
}