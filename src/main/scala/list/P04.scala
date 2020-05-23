package list

class P04 {
  // Find the number of elements of a list.
  def findTheLength[A](list: List[A]): Int =
    if(list == Nil) throw new NoSuchElementException
    else list.size

}
