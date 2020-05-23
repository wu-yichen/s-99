package list

import java.util.NoSuchElementException

class P02 {
  // Find the last but one element of a list.
  def findLastButOne[A](list: List[A]): A =
    if (list.isEmpty) throw new NoSuchElementException
    else list.init.last
}
