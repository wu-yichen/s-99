package list

object P07 {

  // Flatten a nested list structure. flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  // List(1, 1, 2, 3, 5, 8)
  def flatten[A](list: List[A]): List[A] = {
    def h(result: List[A], l: List[A]): List[A] = l match {
      case Nil => result
      case (head: List[A]) :: tail => h(h(result, head), tail)
      case head :: tail => h(result :+ head, tail)
    }

    h(List(), list)
  }
}
