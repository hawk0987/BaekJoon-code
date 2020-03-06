import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var s = next()
    var A = 0
    var B = 0
    var S = s.split("")
    if(S[2]=="0"){
        A = S[1].toInt() * 10
        B = S[3].toInt()
        if(S[4]=="0"){
            B = S[3].toInt() * 10
        }
    } else if(S[3]=="0"){
        A = S[1].toInt()
        B = S[2].toInt() * 10
    } else{
        A = S[1].toInt()
        B = S[2].toInt()
    }
    print(A+B)

}