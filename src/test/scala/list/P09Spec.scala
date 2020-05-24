package list

import org.scalatest.FlatSpec

class P09Spec extends FlatSpec {
  "If a list contains repeated elements they" should "be placed in separate sublists." in {
    val expected = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    assert(P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == expected)
  }

}
