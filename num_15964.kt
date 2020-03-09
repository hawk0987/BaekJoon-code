import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var A = nextBigInteger()
    var B = nextBigInteger()
    var C = (A+B)*(A-B)

    print(C)
}