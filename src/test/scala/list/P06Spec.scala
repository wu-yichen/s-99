package list

import org.scalatest.FlatSpec

class P06Spec extends FlatSpec {

  "A Palindrome list" should "return true" in {
    assert(P06.isPalindrome(List(1,2,3,3,2,1)))
  }


  "A Palindrome list2" should "return true" in {
    assert(P06.isPalindrome(List(1,2,3,5,3,2,1)))
  }

  "A non-Palindrome list" should "return false" in {
    assert(P06.isPalindrome(List(1,2,3,2,4)) == false)
  }

  it should "return false when the list is empty" in {
    assert(P06.isPalindrome(List()) == false)
  }
}
