package list

import org.scalatest.FlatSpec

class P05Spec extends FlatSpec {

  "A list" should "be reversed" in {
    assert(P05.reverse(List(1, 2, 3, 4, 5)) == List(5, 4, 3, 2, 1))
  }
}
