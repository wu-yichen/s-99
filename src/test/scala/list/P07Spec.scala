package list

import org.scalatest.FlatSpec

class P07Spec extends FlatSpec {
  "A list" should "be able to be flattened" in {
    assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }
}
