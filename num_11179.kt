import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var N = nextInt()
    var binary = Integer.toBinaryString(N)

    var reverse = binary.reversed()

    var last = Integer.parseInt(reverse,2)
    print(last)
}