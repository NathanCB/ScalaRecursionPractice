
//find the sum of a list of Integers using tail recursion

import scala.annotation.tailrec
object SumTail {
  val l: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
  
  def sum(list: List[Int]): Int = {
    @tailrec
    def sumWithAccum(list: List[Int], accum: Int): Int = list match {
      case Nil => accum
      case x :: xs => sumWithAccum(xs, x + accum)
    }
    sumWithAccum(list, 0)
  }
  
  def main(args: Array[String]): Unit = {
    println(sum(l))
  }
}