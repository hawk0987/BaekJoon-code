import java.util.*
fun main()= with(Scanner(System.`in`)){
    var K = nextInt()
    var N = nextInt()
    var M = nextInt()

    if(K*N>M){
        print((K*N)-M)
    }else{
        print(0)
    }
}