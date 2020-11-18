import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    
    var c: Int = 0
    var d: Int = 0
    var a = input.nextInt()
    if (a < 10000) {
        for (i <- 1 to a) {
            var b = input.nextInt()
            if (b >= 10 && b <= 20) {
                c = c + 1
            } else {
                d = d + 1
            }
        }
        println(f"$c in")
        println(f"$d out")

    }
}
}
 
