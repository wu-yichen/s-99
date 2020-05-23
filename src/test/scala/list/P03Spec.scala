package list

import org.scalatest.FlatSpec

class P03Spec extends FlatSpec {
  val fixture = new {
    val p03 = new P03
  }

  "A list with the nth that is greater than 0" should "return the nth element" in {
    assert(fixture.p03.nth(2, List(1, 2, 3, 4, 5, 6, 7)) == 2)
  }

  it should "throw exception if the list is empty" in {
    assertThrows[NoSuchElementException](fixture.p03.nth(1, List()))
  }

  it should "return exception if n is less than 0" in {
    assertThrows[NoSuchElementException](fixture.p03.nth(-1, List(1, 2, 3)))
  }

  it should "return the first element if n is 1" in {
    assert(fixture.p03.nth(1, List(1, 2, 3, 4, 5)) == 1)
  }

}
