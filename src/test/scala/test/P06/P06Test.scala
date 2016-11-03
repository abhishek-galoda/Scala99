package test.P06

import P05.P05
import P06.P06
import org.scalatest.{BeforeAndAfter, FunSuite}

class P06Test extends FunSuite with BeforeAndAfter{

  var P06: P06=_

  before {
    P06= new P06
  }

  test("When not an empty list"){
    assert(P06.palindrome(List(1,2,3))==false)
    assert(P06.palindrome(List(1,2,2,1))==true)
    assert(P06.palindrome(List(1,2,3,2,1))==true)
    assert(P06.palindrome(List(1,2))==false)
  }


  test("When not an empty list with 3 elements with recurssion"){
    assert(P06.palindromeWithRecurssion(List(1,2,3))==false)
    assert(P06.palindromeWithRecurssion(List(1,2,2,1))==true)
    assert(P06.palindromeWithRecurssion(List(1,2,3,2,1))==true)
    assert(P06.palindromeWithRecurssion(List(1,2))==false)
  }

}
