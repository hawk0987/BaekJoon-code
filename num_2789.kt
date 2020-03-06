import java.util.*;
fun main()= with(Scanner(System.`in`)) {
    var s = next()
    var S = s.split("")

    for(i in S.indices){
        if(S[i]=="C" || S[i]=="A"|| S[i]=="M"|| S[i]=="B"|| S[i]=="R"|| S[i]=="I"|| S[i]=="D"|| S[i]=="G"|| S[i]=="E"){
            continue
        }else{
            print(S[i])
        }
    }
}