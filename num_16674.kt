import java.util.*
import kotlin.system.exitProcess

fun main()= with((Scanner(System.`in`))){
    var N = nextInt()
    var num = 1
    var n = 0
    var miljup2 = 0
    var miljup0 = 0
    var miljup1 = 0
    var miljup8 = 0


    do{
        n = N%10
        if(n==2){
            num = 1
            miljup2++
        }else if(n==0){
            num = 1
            miljup0++
        }else if(n==1){
            num = 1
            miljup1++
        }else if(n==8){
            num = 1
            miljup8++
        }else{
            num = 0
            break
        }
        N = N/10
    }while(num==1 && N>=1)

    if(num==1 && miljup2>0 && miljup0>0 && miljup1>0 && miljup8>0){
        num = 2
    }
    if(num==2 && miljup2==miljup0 && miljup0==miljup1 && miljup1==miljup8){
        num = 8
    }
    print(num)

}