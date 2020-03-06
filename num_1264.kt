import java.util.*;
fun main() {
    val scan = Scanner(System.`in`)
    while(true){
        var count = 0
        var s = scan.nextLine()
        if(s == "#"){
            break
        }
        s.split("")
        for(i in 0..s.length-1){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'|| s[i]=='A'|| s[i]=='E'|| s[i]=='I'|| s[i]=='O'|| s[i]=='U'){
                count++
            }
        }
        println(count)
    }
}