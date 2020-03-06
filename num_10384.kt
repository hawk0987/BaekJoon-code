import java.util.*
fun main()= with(Scanner(System.`in`)) {
    var N = nextInt()
    nextLine()

    for(i in 1..N){
        var s = nextLine()
        var pangram = Array<Int>(26,{0})
        for(i in 0..s.length-1){
            if(s[i]=='A' || s[i]=='a'){pangram[0]++}
            else if(s[i]=='B' || s[i]=='b'){pangram[1]++}
            else if(s[i]=='C' || s[i]=='c'){pangram[2]++}
            else if(s[i]=='D' || s[i]=='d'){pangram[3]++}
            else if(s[i]=='E' || s[i]=='e'){pangram[4]++}
            else if(s[i]=='F' || s[i]=='f'){pangram[5]++}
            else if(s[i]=='G' || s[i]=='g'){pangram[6]++}
            else if(s[i]=='H' || s[i]=='h'){pangram[7]++}
            else if(s[i]=='I' || s[i]=='i'){pangram[8]++}
            else if(s[i]=='J' || s[i]=='j'){pangram[9]++}
            else if(s[i]=='K' || s[i]=='k'){pangram[10]++}
            else if(s[i]=='L' || s[i]=='l'){pangram[11]++}
            else if(s[i]=='M' || s[i]=='m'){pangram[12]++}
            else if(s[i]=='N' || s[i]=='n'){pangram[13]++}
            else if(s[i]=='O' || s[i]=='o'){pangram[14]++}
            else if(s[i]=='P' || s[i]=='p'){pangram[15]++}
            else if(s[i]=='Q' || s[i]=='q'){pangram[16]++}
            else if(s[i]=='R' || s[i]=='r'){pangram[17]++}
            else if(s[i]=='S' || s[i]=='s'){pangram[18]++}
            else if(s[i]=='T' || s[i]=='t'){pangram[19]++}
            else if(s[i]=='U' || s[i]=='u'){pangram[20]++}
            else if(s[i]=='V' || s[i]=='v'){pangram[21]++}
            else if(s[i]=='W' || s[i]=='w'){pangram[22]++}
            else if(s[i]=='X' || s[i]=='x'){pangram[23]++}
            else if(s[i]=='Y' || s[i]=='y'){pangram[24]++}
            else if(s[i]=='Z' || s[i]=='z'){pangram[25]++}
        }
        if(pangram[0]>=3 && pangram[1]>=3 && pangram[2]>=3 && pangram[3]>=3 && pangram[4]>=3 && pangram[5]>=3 && pangram[6]>=3 && pangram[7]>=3
            && pangram[8]>=3 && pangram[9]>=3 && pangram[10]>=3 && pangram[11]>=3 && pangram[12]>=3 && pangram[13]>=3 && pangram[14]>=3
            && pangram[15]>=3 && pangram[16]>=3 && pangram[17]>=3 && pangram[18]>=3 && pangram[19]>=3 && pangram[20]>=3 && pangram[21]>=3
            && pangram[22]>=3 && pangram[23]>=3 && pangram[24]>=3 && pangram[25]>=3){
            println("Case $i: Triple pangram!!!")
        }
        else if(pangram[0]>=2 && pangram[1]>=2 && pangram[2]>=2 && pangram[3]>=2 && pangram[4]>=2 && pangram[5]>=2 && pangram[6]>=2 && pangram[7]>=2
            && pangram[8]>=2 && pangram[9]>=2 && pangram[10]>=2 && pangram[11]>=2 && pangram[12]>=2 && pangram[13]>=2 && pangram[14]>=2
            && pangram[15]>=2 && pangram[16]>=2 && pangram[17]>=2 && pangram[18]>=2 && pangram[19]>=2 && pangram[20]>=2 && pangram[21]>=2
            && pangram[22]>=2 && pangram[23]>=2 && pangram[24]>=2 && pangram[25]>=2){
            println("Case $i: Double pangram!!")
        }
        else if (pangram[0]>=1 && pangram[1]>=1 && pangram[2]>=1 && pangram[3]>=1 && pangram[4]>=1 && pangram[5]>=1 && pangram[6]>=1 && pangram[7]>=1
                    && pangram[8]>=1 && pangram[9]>=1 && pangram[10]>=1 && pangram[11]>=1 && pangram[12]>=1 && pangram[13]>=1 && pangram[14]>=1
                    && pangram[15]>=1 && pangram[16]>=1 && pangram[17]>=1 && pangram[18]>=1 && pangram[19]>=1 && pangram[20]>=1 && pangram[21]>=1
                    && pangram[22]>=1 && pangram[23]>=1 && pangram[24]>=1 && pangram[25]>=1){
                println("Case $i: Pangram!")
            }
        else{
            println("Case $i: Not a pangram")
        }

    }
}