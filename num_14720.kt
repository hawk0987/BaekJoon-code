import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var N = nextInt()
    var num = 0
    var count = 0
    var milk = Array<Int>(N,{0})
    for(i in 0..N-1){
        milk[i] = nextInt()
    }

    for(i in 0..N-1){
        if(milk[i]==num){
            if(num==2){
                count++
                num = 0
            }else{
                count++
                num++
            }
        }
    }
    print(count)
}