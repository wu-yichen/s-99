package list

import scala.runtime.Nothing$

class P01 {
  // Find the last element of a list.
  def FindLast[A](list: List[A]): Option[A] = {
    if (list == Nil) None
    else if (list.tail == Nil) Some(list(0))
    else FindLast(list.tail)
  }
}
