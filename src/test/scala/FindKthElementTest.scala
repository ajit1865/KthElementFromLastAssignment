import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class FindKthElementTest extends AnyFlatSpec {
  val objOfFindKthElement = new FindKthElement
  it should "find the kth element from last " in {
    assert(objOfFindKthElement.getKthElementFromEnd(List(1, 2, 3, 4, 5, 6, 76, 9), 1) == 9)
  }

  it should "find the 5th element from last which is 4" in {
    assert(objOfFindKthElement.getKthElementFromEnd(List(1, 2, 3, 4, 5, 6, 76, 9), 5) == 4)
  }

  it should "throw an Exception if list is empty" in {
    an[IllegalArgumentException] should be thrownBy {
      objOfFindKthElement.getKthElementFromEnd(List(), 0)
    }
  }

  it should "throw an Exception kth element is out of range" in {
    an[IndexOutOfBoundsException] should be thrownBy {
      objOfFindKthElement.getKthElementFromEnd(List(1, 2, 3, 4, 5, 6, 76, 9), 12)
    }
  }
}
