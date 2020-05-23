package list

import org.scalatest.FlatSpec

class P04Spec extends FlatSpec {
  val fixture = new {
    val p04 = new P04
  }
  "A non-empty list" should "return the number of the elements" in {
    assert(fixture.p04.findTheLength(List(1, 2, 3, 4, 5, 6)) == 6)
  }

  "An empty list" should "throw no such element exception" in {
    assertThrows[NoSuchElementException](fixture.p04.findTheLength(List()))
  }
}
