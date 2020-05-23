package list

import org.scalatest.FlatSpec

class P02Spec extends FlatSpec {
  val fixture = new {
    val p02 = new P02
  }
  "A list" should "return the last but one element" in {
    assert(fixture.p02.findLastButOne(List(1, 1, 2, 3, 5, 8)) == 5)
  }

  it should "throw exception when it is an empty list" in {
    assertThrows[NoSuchElementException] {
      fixture.p02.findLastButOne(List())
    }
  }
}
