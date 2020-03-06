import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var N = nextInt()
    var kim = nextInt()
    var lim = nextInt()
    var round = 0

    while(kim != lim){
        kim = kim/2 + kim%2
        lim = lim/2 + lim%2
        round++
    }
    print(round)

}