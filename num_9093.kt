import java.util.*;
fun main(args: Array<String>){
    var scan = Scanner(System.`in`)
    var T = scan.nextInt()
    scan.nextLine()
    for(i in 1..T){
        var S = scan.nextLine()
        var reverse = S.split(" ")

        for(j in reverse.indices) {
            if(j!=0){
                print(" ")
            }
            print(reverse[j].reversed())
        }
        if(i!=T){
            println()
        }
    }
}