case class PointCase(val x:Int,val y:Int){     //2.6ケースクラス定義練習
  def distance(that: Point):Int={
    val xdiff=math.abs(that.x-this.x)
    val ydiff=math.abs(that.x-this.x)
    math.sqrt(xdiff*xdiff*ydiff*ydiff).toInt
  }
  def +(that:Point):Point=new Point(x+that.x,y+that.y)
}



object Sample26 {
  def main(args: Array[String]): Unit = {

    val map=Map(PointCase(10,10)->1,PointCase(20,20)->2)    //2.6ケースクラス定義練習
    val caseToString=PointCase(10,10)

    println(map(PointCase(10,10)))        //2.6ケースクラス定義練習
    println(map(PointCase(20,20)))        //2.6ケースクラス定義練習
    println(caseToString.toString)        //2.6ケースクラス定義練習

  }

}
