import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var bucket1 = Array<Int>(2,{0})
    var bucket2 = Array<Int>(2,{0})
    var max = 0
    bucket1[0] = nextInt()
    bucket1[1] = nextInt()
    bucket2[0] = nextInt()
    bucket2[1] = nextInt()

    var apple = bucket1[0] + bucket2[1]
    var orange = bucket1[1] + bucket2[0]

    if(apple>orange){
        max = orange
    }else{
        max = apple
    }

    print(max)
}