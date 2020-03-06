import java.io.*
import java.util.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    var N = br.readLine()
    for(i in 1..N.toInt()){
        var token = StringTokenizer(br.readLine())
        var A = Integer.parseInt(token.nextToken())
        var B = Integer.parseInt(token.nextToken())
        var num = A+B
        bw.write("$num\n")
        bw.flush()
    }
}