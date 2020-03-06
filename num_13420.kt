import java.util.*;
fun main()= with((Scanner(System.`in`))) {
    var T = nextInt()
    for(i in 1..T){
        var num1 = nextLong()
        var cal = next()
        var num2 = nextLong()
        var same = next()
        var num3 = nextLong()

        if(cal=="+"){
            var result = num1 + num2
            if(num3==result){
                println("correct")
            }else
                println("wrong answer")
        }
        if(cal=="-"){
            var result = num1 - num2
            if(num3==result){
                println("correct")
            }else
                println("wrong answer")
        }
        if(cal=="*"){
            var result = num1 * num2
            if(num3==result){
                println("correct")
            }else
                println("wrong answer")
        }
        if(cal=="/"){
            var result = num1 / num2
            if(num3==result){
                println("correct")
            }else
                println("wrong answer")
        }
    }
}