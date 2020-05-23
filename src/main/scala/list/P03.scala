package list

class P03 {
  // Find the Kth element of a list.
  def nth[A](n: Int, list: List[A]): A = {
    def h(num: Int, l: List[A]): A =
      if (l == Nil || num < 0) throw new NoSuchElementException
      else if (num == 0) l(0)
      else h(num - 1, l.tail)

    h(n - 1, list)
  }
}
