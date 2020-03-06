import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var N = nextInt()
    var computer = Array<Int>(100,{0})
    var count = 0

    for(i in 1..N){
        var man = nextInt()

        if(computer[man-1]==1){
            count++
        }else{
            computer[man-1]++
        }
    }
    print(count)
}