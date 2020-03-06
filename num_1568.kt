import java.util.*;
fun main() {
    val scan = Scanner(System.`in`)
    var N = scan.nextInt()
    var time = 0

    while(N>0){
        for(i in 1..N){
            N -= i
            if(N<0){
                N += i
                break;
            }
            time++
        }
    }
    print(time)
}