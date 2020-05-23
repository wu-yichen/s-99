package list

object P06 {
  //  Find out whether a list is a palindrome.
  def isPalindrome[A](list: List[A]): Boolean = {
    def h(begin: Int, end: Int): Boolean = {
      if (end < 0) false
      else if (end - begin <= 0) true
      else if (list(begin) != list(end)) false
      else h(begin + 1, end - 1)
    }

    h(0, list.size - 1)
  }

}
