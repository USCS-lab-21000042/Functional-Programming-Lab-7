import scala.io.StdIn
object test extends App{
    def filterEvenNumbers()={
        print("Enter integers :")
        var line=StdIn.readLine()
        var numbers=line.split(" ").map(_.toInt).toList
        val num=(x:Int)=> if x%2==0 then true else false
        var list=numbers.filter(num)
        print(s"Even number ${list}")
    }
}