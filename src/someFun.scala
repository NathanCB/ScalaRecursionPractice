import scala.annotation.tailrec

class someFun {
 
  def sum(numList: List[Int]): Int = numList match{
    case Nil => 0
    case head :: tail => head + sum(tail)
  }
  
  def sumWithTrace(list: List[Int]): Int = list match {
    case Nil => {
      val stackTraceArray = Thread.currentThread.getStackTrace
      stackTraceArray.foreach(println)
      0
    }
    case head :: tail => head + sumWithTrace(tail)
  }
  object ViewStack extends App{   
      val list = List.range(1,5)  
      sumWithTrace(list)
  }
  
  //tail recursive sum
  def tailRecSum(list: List[Int]): Int = {
    @tailrec
    def tailRecSumAccum(list: List[Int], accum: Int): Int = list match {
      case Nil => accum
      case x :: xs => tailRecSumAccum(xs, accum + x)
    }
    tailRecSumAccum(list, 0)
  }

}


