import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var s1 = Array<Char>(15,{'.'})
    var s2 = Array<Char>(15,{'.'})
    var s3 = Array<Char>(15,{'.'})
    var s4 = Array<Char>(15,{'.'})
    var s5 = Array<Char>(15,{'.'})
    var word1 = next()
    var word2 = next()
    var word3 = next()
    var word4 = next()
    var word5 = next()

    for(i in 0..word1.length-1){
        s1[i]=word1[i]
    }
    for(i in 0..word2.length-1){
        s2[i]=word2[i]
    }
    for(i in 0..word3.length-1){
        s3[i]=word3[i]
    }
    for(i in 0..word4.length-1){
        s4[i]=word4[i]
    }
    for(i in 0..word5.length-1){
        s5[i]=word5[i]
    }

    for(i in 0..14){
        if(s1[i]!='.'){
            print(s1[i])
        }
        if(s2[i]!='.'){
            print(s2[i])
        }
        if(s3[i]!='.'){
            print(s3[i])
        }
        if(s4[i]!='.'){
            print(s4[i])
        }
        if(s5[i]!='.'){
            print(s5[i])
        }
    }
}