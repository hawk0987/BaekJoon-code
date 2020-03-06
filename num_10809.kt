import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var s = next()
    var count = 0
    var ary = Array<Int>(26,{-1})

    for(i in 0..s.length-1){
        if(s[i]=='a'){
            if(ary[0]==-1){
                ary[0] = count
            }
        }else if(s[i]=='b'){
            if(ary[1]==-1){
                ary[1] = count
            }
        }else if(s[i]=='c'){
            if(ary[2]==-1){
                ary[2] = count
            }
        }else if(s[i]=='d'){
            if(ary[3]==-1){
                ary[3] = count
            }
        }else if(s[i]=='e'){
            if(ary[4]==-1){
                ary[4] = count
            }
        }else if(s[i]=='f'){
            if(ary[5]==-1){
                ary[5] = count
            }
        }else if(s[i]=='g'){
            if(ary[6]==-1){
                ary[6] = count
            }
        }else if(s[i]=='h'){
            if(ary[7]==-1){
                ary[7] = count
            }
        }else if(s[i]=='i'){
            if(ary[8]==-1){
                ary[8] = count
            }
        }else if(s[i]=='j'){
            if(ary[9]==-1){
                ary[9] = count
            }
        }else if(s[i]=='k'){
            if(ary[10]==-1){
                ary[10] = count
            }
        }else if(s[i]=='l'){
            if(ary[11]==-1){
                ary[11] = count
            }
        }else if(s[i]=='m'){
            if(ary[12]==-1){
                ary[12] = count
            }
        }else if(s[i]=='n'){
            if(ary[13]==-1){
                ary[13] = count
            }
        }else if(s[i]=='o'){
            if(ary[14]==-1){
                ary[14] = count
            }
        }else if(s[i]=='p'){
            if(ary[15]==-1){
                ary[15] = count
            }
        }else if(s[i]=='q'){
            if(ary[16]==-1){
                ary[16] = count
            }
        }else if(s[i]=='r'){
            if(ary[17]==-1){
                ary[17] = count
            }
        }else if(s[i]=='s'){
            if(ary[18]==-1){
                ary[18] = count
            }
        }else if(s[i]=='t'){
            if(ary[19]==-1){
                ary[19] = count
            }
        }else if(s[i]=='u'){
            if(ary[20]==-1){
                ary[20] = count
            }
        }else if(s[i]=='v'){
            if(ary[21]==-1){
                ary[21] = count
            }
        }else if(s[i]=='w'){
            if(ary[22]==-1){
                ary[22] = count
            }
        }else if(s[i]=='x'){
            if(ary[23]==-1){
                ary[23] = count
            }
        }else if(s[i]=='y'){
            if(ary[24]==-1){
                ary[24] = count
            }
        }else if(s[i]=='z'){
            if(ary[25]==-1){
                ary[25] = count
            }
        }
        count++
    }

    for(i in 0..25){
        print(ary[i])
        print(" ")
    }

}