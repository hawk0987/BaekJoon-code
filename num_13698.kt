import java.util.*
fun main()=with(Scanner(System.`in`)) {
    var fix = next()
    var small = 1
    var big = 4

    for(i in 0..fix.length-1){
        if(fix[i]=='A'){
            if(small==1 && big==2){
                small = 2
                big = 1
            }else if(small==2 && big==1){
                small = 1
                big = 2
            }else if(small==1){
                small = 2
            }else if(small==2){
                small = 1
            }else if(big==1){
                big = 2
            }else if(big==2){
                big = 1
            }
        }

        else if(fix[i]=='B'){
            if(small==1 && big==3){
                small = 3
                big = 1
            }else if(small==3 && big==1){
                small = 1
                big = 3
            }else if(small==1){
                small = 3
            }else if(small==3){
                small = 1
            }else if(big==1){
                big = 3
            }else if(big==3){
                big = 1
            }
        }

        else if(fix[i]=='C'){
            if(small==1 && big==4){
                small = 4
                big = 1
            }else if(small==4 && big==1){
                small = 1
                big = 4
            }else if(small==1){
                small = 4
            }else if(small==4){
                small = 1
            }else if(big==1){
                big = 4
            }else if(big==4){
                big = 1
            }
        }

        else if(fix[i]=='D'){
            if(small==2 && big==3){
                small = 3
                big = 2
            }else if(small==3 && big==2){
                small = 2
                big = 3
            }else if(small==2){
                small = 3
            }else if(small==3){
                small = 2
            }else if(big==2){
                big = 3
            }else if(big==3){
                big = 2
            }
        }

        else if(fix[i]=='E'){
            if(small==2 && big==4){
                small = 4
                big = 2
            }else if(small==4 && big==2){
                small = 2
                big = 4
            }else if(small==2){
                small = 4
            }else if(small==4){
                small = 2
            }else if(big==2){
                big = 4
            }else if(big==4){
                big = 2
            }
        }

        else if(fix[i]=='F'){
            if(small==3 && big==4){
                small = 4
                big = 3
            }else if(small==4 && big==3){
                small = 3
                big = 4
            }else if(small==3){
                small = 4
            }else if(small==4){
                small = 3
            }else if(big==3){
                big = 4
            }else if(big==4){
                big = 3
            }
        }

    }
    println(small)
    print(big)
}