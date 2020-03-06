import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var word = next()
    var count = Array<Int>(26,{0})
    var max = 0
    var num = 0

    for(i in 0..word.length-1){
        if(word[i]=='a' || word[i]=='A'){
            count[0]++
        }else if(word[i]=='b' || word[i]=='B'){
            count[1]++
        }else if(word[i]=='c' || word[i]=='C'){
            count[2]++
        }else if(word[i]=='d' || word[i]=='D'){
            count[3]++
        }else if(word[i]=='e' || word[i]=='E'){
            count[4]++
        }else if(word[i]=='f' || word[i]=='F'){
            count[5]++
        }else if(word[i]=='g' || word[i]=='G'){
            count[6]++
        }else if(word[i]=='h' || word[i]=='H'){
            count[7]++
        }else if(word[i]=='i' || word[i]=='I'){
            count[8]++
        }else if(word[i]=='j' || word[i]=='J'){
            count[9]++
        }else if(word[i]=='k' || word[i]=='K'){
            count[10]++
        }else if(word[i]=='l' || word[i]=='L'){
            count[11]++
        }else if(word[i]=='m' || word[i]=='M'){
            count[12]++
        }else if(word[i]=='n' || word[i]=='N'){
            count[13]++
        }else if(word[i]=='o' || word[i]=='O'){
            count[14]++
        }else if(word[i]=='p' || word[i]=='P'){
            count[15]++
        }else if(word[i]=='q' || word[i]=='Q'){
            count[16]++
        }else if(word[i]=='r' || word[i]=='R'){
            count[17]++
        }else if(word[i]=='s' || word[i]=='S'){
            count[18]++
        }else if(word[i]=='t' || word[i]=='T'){
            count[19]++
        }else if(word[i]=='u' || word[i]=='U'){
            count[20]++
        }else if(word[i]=='v' || word[i]=='V'){
            count[21]++
        }else if(word[i]=='w' || word[i]=='W'){
            count[22]++
        }else if(word[i]=='x' || word[i]=='X'){
            count[23]++
        }else if(word[i]=='y' || word[i]=='Y'){
            count[24]++
        }else if(word[i]=='z' || word[i]=='Z'){
            count[25]++
        }
    }

    for(i in 0..25){
        if(count[i]>=max){
            max = count[i]
            num = i
        }
    }
    for(i in 0..25){
        if(i!=num){
            if(count[i]==count[num]){
                max = -1
                break
            }
        }
    }


    if(max==count[0]){
        print("A")
    }else if(max==count[1]){
        print("B")
    }else if(max==count[2]){
        print("C")
    }else if(max==count[3]){
        print("D")
    }else if(max==count[4]){
        print("E")
    }else if(max==count[5]){
        print("F")
    }else if(max==count[6]){
        print("G")
    }else if(max==count[7]){
        print("H")
    }else if(max==count[8]){
        print("I")
    }else if(max==count[9]){
        print("J")
    }else if(max==count[10]){
        print("K")
    }else if(max==count[11]){
        print("L")
    }else if(max==count[12]){
        print("M")
    }else if(max==count[13]){
        print("N")
    }else if(max==count[14]){
        print("O")
    }else if(max==count[15]){
        print("P")
    }else if(max==count[16]){
        print("Q")
    }else if(max==count[17]){
        print("R")
    }else if(max==count[18]){
        print("S")
    }else if(max==count[19]){
        print("T")
    }else if(max==count[20]){
        print("U")
    }else if(max==count[21]){
        print("V")
    }else if(max==count[22]){
        print("W")
    }else if(max==count[23]){
        print("X")
    }else if(max==count[24]){
        print("Y")
    }else if(max==count[25]){
        print("Z")
    }else{
        print("?")
    }

}