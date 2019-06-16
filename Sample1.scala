class Printer{
  def echo(str:String):Unit=println(str)
  def double(n:Int):Int=n*2

}


object Sample  {


  //def double(n:Int): Int=n*2



  def main(args: Array[String]): Unit = {

    def isAlpha(str1:String): Boolean= str1.matches("[a-zA-Z0-9\\s]+")

    val print = new Printer()
    val isAlphaF=isAlpha _
    val isAlphaF2=new Function[String,Boolean] {
      def apply(str:String)=str.matches("[a-zA-Z0-9\\s]+")
    }
    val words=Seq("scala","2.12")
    val maybeNum:Option[Int]=Some(123)
    val num:Int=maybeNum match {
      case Some(num)=>num
      case None=>0
    }
    val doubled = Seq(1 to 3).map{
      i=>println(i)

    }
    val result : Seq[Int] = for{
      i<-(1 to 3)   //ループ
      j<-(2 to 4)
      k<-(3 to 5)
      result = (i*j*k)
    }yield result




    print.echo("Hi!")
    println(print.double(5))
    println(isAlpha("あああ"))
    println(isAlphaF("aaa"))
    println(words.filter(isAlphaF))
    println(num)
    println(result)
  }



}
