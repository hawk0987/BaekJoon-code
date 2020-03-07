import java.io.*
fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.`out`))
    var N = Integer.parseInt(br.readLine())
    var clap = 0
    for(i in 1..N){
        var num = i
        do{
            var R = num%10
            if(R==3 || R==6 || R==9){
                clap++
            }
            num = num/10
        }while (num!=0)

    }
    bw.write(clap.toString())
    bw.flush()
}