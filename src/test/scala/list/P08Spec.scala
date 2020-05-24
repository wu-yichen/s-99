package list

import org.scalatest.FlatSpec

class P08Spec extends FlatSpec {
  "If a list contains repeated elements they" should "be replaced with a single copy of the element" in {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
