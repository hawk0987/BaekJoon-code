import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var A = nextDouble()
    var B = nextDouble()
    var C = nextDouble()

    var num1 = A*B/C
    var num2 = A/B*C

    if(num1>num2){
        print(num1.toLong())
    }else{
        print(num2.toLong())
    }
}