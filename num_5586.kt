import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var word = Array<Char?>(10000,{null})
    var s = next()
    for(i in 0..s.length-1){
        word[i] = s[i]
    }
    var JOI = 0
    var IOI = 0

    var i=0
    while(word[i] != null){
        if(word[i]=='J' && word[i+1]=='O' && word[i+2]=='I'){
            JOI++
        }else if(word[i]=='I' && word[i+1]=='O' && word[i+2]=='I'){
            IOI++
        }
        i++
    }

    println(JOI)
    println(IOI)
}