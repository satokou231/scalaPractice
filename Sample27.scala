//2-7 制御構文


object Sample27 {
  def main(args: Array[String]): Unit = {

    val ab=if (3<4)"a" else "b"
    val a = 1
    var num:Int = 10
    var i= 1
    val list=List(1,2,5)


    {if(a<2) println("1") ; if(a>2) println("2") ; println("3")}
    val b=if(num<20){true} else {false}
    while (i<=10){
      //println("i:"+i)
      i=i+1
    }
    for (x<-1 to 3; y<-1 to 3){
      //println("x:"+x+"y:"+y)
    }
    println("\n")
    for (x<-1 to 3; y<-1 to 3 if x != y){
      //println("x:"+x+"y:"+y)
    }
    val e1=for (e<-List(1,2,3))yield e
    val e2=for (e<-List(1,2,3))yield e+1
    val now = i match {
      case 0 => "0"
      case 1 => "1"
      case 2 => "2"
      case 3 => "3"
      case _ => "3<"
    }
    list match {
      case List(a,b,c,d,e)=> println(a,b,c,d,e)
      case _ => println("???")
    }
    list match {
      case List(1,2,3)=>println(1,2,3)
      case List(1,2,3,4)=>println(1,2,3,4)
      case List(1,2,3,4,5)=>println(1,2,3,4,5)
      case List(a,b,c,d,e)=>println("要素5")
      case _ =>println("???")
    }



    println("ab="+ab)
    println("b="+b)
    println("e1="+e1)
    println("e2="+e2)
    println("Now="+now)


  }

}
