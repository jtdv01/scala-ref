abstract class Sushi
case class Sashimi(name: String) extends Sushi
case class Onigiri(name: String) extends Sushi

object main{
  def main(args: Array[String]): Unit = {
    val x = new Sashimi("sashimi x")
    val y = new Onigiri("y")
    println(x)
    println(y)

    var bento:Tuple2[Sushi,Sushi] = new Tuple2(x,y)
    println(bento)

    var first = bento._1
    println("The first bento is :" + first)
  }
}
