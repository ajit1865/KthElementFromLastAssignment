import scala.io.StdIn

object Driver extends App {
  val obj = new FindKthElement
  val list = List(1, 2, 3, 4, 5, 6, 76, 9)
  println("Enter the Kth element position from last : ")
  val whichYouWantFromLast = StdIn.readInt()
  println(obj.getKthElementFromEnd(list, whichYouWantFromLast))
}