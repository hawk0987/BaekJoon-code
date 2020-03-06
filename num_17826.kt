import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var ary =Array<Int>(50,{0})
    for(i in ary.indices){
        ary[i] = nextInt()
    }
    ary.sortDescending()
    var I = 0

    var hong = nextInt()
    for(i in ary.indices){
        if(hong==ary[i]){
            I = i+1
        }
    }

    if(I>=1 && I<=5){
        print("A+")
    }else if(I>=6 && I<=15){
        print("A0")
    }else if(I>=16 && I<=30){
        print("B+")
    }else if(I>=31 && I<=35){
        print("B0")
    }else if(I>=36 && I<=45){
        print("C+")
    }else if(I>=46 && I<=48){
        print("C0")
    }else if(I>=49 && I<=50){
        print("F")
    }

}