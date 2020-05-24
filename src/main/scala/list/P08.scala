package list

object P08 {
  // Eliminate consecutive duplicates of list elements.
  def compress[A](list: List[A]): List[A] = {
    def h(l: List[A], result: List[A]): List[A] = {
      if (l == Nil) result
      else h(l.tail, if (result.isEmpty || result.last != l.head) result :+ l.head else result)
    }

    h(list, List())
  }

}
