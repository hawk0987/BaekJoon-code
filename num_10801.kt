import java.util.*;
fun main() {
    val scan = Scanner(System.`in`)
    var scoreA = 0
    var scoreB = 0
    var A = Array<Int>(10,{0})
    var B = Array<Int>(10,{0})

    for(i in 0..9){
        A[i] = scan.nextInt()
    }
    for(i in 0..9) {
        B[i] = scan.nextInt()
    }

    for(i in 0..9){
        if(A[i]>B[i]){
            scoreA++
        }
        else if(A[i]<B[i]){
            scoreB++
        }
    }

    if(scoreA>scoreB){
        println("A")
    }
    else if(scoreA<scoreB){
        println("B")
    }
    else{
        println("D")
    }
}