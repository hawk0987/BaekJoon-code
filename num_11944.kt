import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var N = nextInt()
    var M = nextInt()
    var n = 0

    var Nsize = N.toString()
    var ary = Array<Char?>(Nsize.length,{null})
    for(i in 0..Nsize.length-1){
        ary[i] = N.toString()[i]
    }

    if(N>=M){
        for(i in 0..M-1){
            if(i in ary.indices){
                print(ary[i])
            }else{
                n = i%(Nsize.length)
                print(ary[n])
            }
        }
    }else{
        for(i in 1..N){
            print(N)
        }
    }
}