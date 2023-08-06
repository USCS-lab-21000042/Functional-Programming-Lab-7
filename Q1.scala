import scala.io.StdIn
object test extends App{
    def filterEvenNumbers():List[Int]={
        print("Enter integers :")
        var line=StdIn.readLine()
        var numbers=line.split(" ").map(_.toInt).toList
        //val num=(x:Int)=> if x%2==0 then true else false
        var list=numbers.filter(l=>l%2==0)
        //print(s"Even numbers ${list}")
        return list
    }
    print(s"Even numbers ${filterEvenNumbers()}")
}