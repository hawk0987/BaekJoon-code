import java.util.*;
fun main() {
    val scan = Scanner(System.`in`)

    var coffee = 0
    var getoray = 0
    var coke = 0
    var button = scan.nextLine()
    button.split(" ")

    for(i in 0..button.length-1){
        if(button[i]=='1'){
            coffee++
        }else if(button[i]=='2'){
            getoray++
        }else if(button[i]=='3') {
            coke++
        }

    }
    print(5000-(coffee*500 + getoray*800 + coke*1000))
}