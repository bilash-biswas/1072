import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    var i: Int
    var b: Int
    var c: Int = 0;
    var d: Int = 0;
    var a = input.nextInt();
    if (a < 10000) {
        for (i in 1..a) {
            b = input.nextInt()
            if (b >= 10 && b <= 20) {
                c = c + 1;
            } else {
                d = d + 1;
            }
        }
        println("$c in");
        println("$d out");
    }
}

