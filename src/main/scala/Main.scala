@main def hello: Unit = 
   val ages = Seq(42, 75, 29, 64)
   println("The oldest person is ${ages.max}")
   println("Hello world!")
   println(msg)

def msg = "I was compiled by Scala 3 by Jasmin. Hello. :)"
