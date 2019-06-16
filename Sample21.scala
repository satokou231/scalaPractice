class Point(val x:Int,val y:Int){     //2.2クラス定義練習
  def distance(that: Point):Int={
    val xdiff=math.abs(that.x-this.x)
    val ydiff=math.abs(that.x-this.x)
    math.sqrt(xdiff*xdiff*ydiff*ydiff).toInt
  }
  def +(that:Point):Point=new Point(x+that.x,y+that.y)
}

trait Sum{      //2.3トレイトの定義練習
  val a:Int
  val b:Int
  def printSum():Unit=println(a+b)
}
trait Avg{     //2.3トレイトの定義練習
  val a:Int
  val b:Int
  def printAvg():Unit=println((a+b)/2)
}
trait div{    //2.3トレイトの定義練習
  val c:Int
  val d:Int
  def printDiv():Unit=println(c/d)
}

abstract class Shape{   //2.2クラス定義練習
 def draw():Unit={
   println("不明")
 }
}
class Tri extends Shape{    //2.2クラス定義練習
  override def draw():Unit={
    println("三角")
  }
}
class Rec extends Shape{    //2.2クラス定義練習
  override def draw():Unit={
    println("四角")
  }
}
class Math(val a:Int,val b:Int,val c:Int,val d:Int) extends Sum with Avg with div   //2.3トレイトの定義練習

object Sample2 {
  def main(args: Array[String]): Unit = {
    val words:String=
      """
      this is
      my sample
      """.stripMargin

    val p:(Int,Int,Int)=(3,4,5)
    val point1:Point=new Point(10,10)
    val point2:Point=new Point(100,100)
    val shape:Shape=new Tri
    val sumAvgDiv=new Math(2,2,4,2)

    shape.draw()
    sumAvgDiv.printSum()    //2.3トレイトの定義練習
    sumAvgDiv.printAvg()    //2.3トレイトの定義練習
    sumAvgDiv.printDiv()    //2.3トレイトの定義練習
    println(words)
    println(point1.distance(point2))    //2.2クラス定義練習
    println(point1+point2)              //2.2クラス定義練習
    p match {
      case (z,y,x)=>
        println(x)
        println(y)
        println(z)

    }
  }


}
