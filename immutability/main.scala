object main {
  case class FullName(firstName: String,lastName: String)
  def main(args: Array[String]): Unit = {

    var name = FullName("Bern","Stein")
    println(name.firstName)

    //val name2 = FullName("Bern","Stein")
    //println(name)

    // Cant modify it anymore
    //name.firstName="x"
  }

}
