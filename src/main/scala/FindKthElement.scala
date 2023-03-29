//Program to find Kth element from last in list
class FindKthElement {

  //getKthElementFromEnd method contains all functionality to get Kth element from last
  def getKthElementFromEnd(number: List[Int], positionFromLast: Int): Int = {

    //checking if list is empty then throw exception
    if (number.isEmpty)
      throw new IllegalArgumentException("Empty list")

    //if provided Kth element is less than 1 or greater than list length then throw exception
    if (positionFromLast < 1 || positionFromLast > number.length)
      throw new IndexOutOfBoundsException("Position from last must be within the range of the number list.")
    else {
      val lengthOfList = number.length
      number(lengthOfList - positionFromLast)
    }
  }
}

