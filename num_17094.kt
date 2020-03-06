import java.util.*;
fun main() {
    val scan = Scanner(System.`in`)
    var T = scan.nextInt()
    var ary = Array<String?>(T,{null})
    var s = scan.next()
    var b = s.split("")

    var counte = 0
    var count2 = 0

    for(i in 1..T){
        if(b[i]=="e"){
            counte++
        }
        else if(b[i]=="2"){
            count2++
        }
    }

    if(count2>counte){
        println("2")
    }
    else if(count2<counte) {
        println("e")
    }else{
        println("yee")
    }




}