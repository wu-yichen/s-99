package list

import org.scalatest._

class P01Spec extends FlatSpec {

  val fixture = new {
    val p = new P01
  }
  "A List" can "return its last element" in {
    assert(fixture.p.FindLast(List(1, 2, 3, 4, 5)).get == 5)
  }
  it should "return nothing when the list is empty" in {
    assert(fixture.p.FindLast(List()) == None)
  }
}
