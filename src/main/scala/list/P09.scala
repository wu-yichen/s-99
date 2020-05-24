package list

object P09 {
  // pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  // List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

  def pack[A](list: List[A]): List[List[A]] = {
    def h(l: List[A], result: List[List[A]]): List[List[A]] = {
      if (l == Nil) result
      else if (result.isEmpty || result.last(0) != l.head) {
        h(l.tail, result :+ List(l.head))
      }
      else {
        val newList = result.updated(result.size - 1, result(result.size - 1) :+ l.head)
        h(l.tail, newList)
      }
    }

    h(list, List())
  }
}
