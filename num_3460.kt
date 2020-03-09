import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var T = nextInt()
    for(i in 1..T){
        var n = nextInt()
        var count = 0

        while(n!=0){
            if(n%2==1){
                print(count)
                print(" ")
            }
            n /= 2
            count++
        }
    }
}