import  scala.io.StdIn
object  Q3 extends  App{
    def isPrime(n: Int): Boolean = {
        if (n <= 1) false
        else if (n <= 3) true
        else if (n % 2 == 0 || n % 3 == 0) false
        else {
            var i = 5
            while ((i * i)/2 <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false
            i =i+1
            }
            true
        }

        
    }
    print("Enter numbers ")
    var input=StdIn.readLine()
    var numbers=input.split(" ").map(_.toInt).toList
    var list=numbers.filter(isPrime)
    print(s"Peime number ${list}")
}