import  scala.io.StdIn
object  Q2 extends  App{
    def  calculateSquare():List[Int]={
        print("Enter numbers")
        var input=StdIn.readLine()
        var numbers=input.split(" ").map(_.toInt).toList
        val out=numbers.map(x=>x*x)
        return out
    }

    print(s"Squre ${calculateSquare()} ")
}