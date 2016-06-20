class util

object main{
	def hasUpperCase(s: String) = s.exists(_.isUpper)

  def main(args: Array[String]): Unit = {
    var x = new util()
    println(x)

		var y = hasUpperCase("fooBar");
 		println(y); 
	}

}
