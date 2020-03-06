import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var n = nextInt()
    var count = 1

    while(n!=1){
        if(n%2==0){
            n /= 2
            count++
        }else{
            n = (3*n)+1
            count++
        }
    }
    print(count)
}