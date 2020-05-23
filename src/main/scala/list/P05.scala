package list

object P05 {

  // Reverse a list.
  def reverse[A](list: List[A]): List[A] = {
    def h(l: List[A], result: List[A]): List[A] =
      if (l == Nil) result
      else h(l.tail, l.head :: result)
    h(list, List())
  }
}
