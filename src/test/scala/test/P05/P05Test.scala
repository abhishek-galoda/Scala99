package test.P05

import P04.P04
import P05.P05
import org.scalatest.{BeforeAndAfter, FunSuite}

class P05Test extends FunSuite with BeforeAndAfter{

  var P05:P05=_

  before {
    P05= new P05
  }

  test("When not an empty list"){
    assert(P05.reverse(List(1,2,3))===List(3,2,1))
  }


  test("When not an empty list with 3 elements with recurssion"){
    assert(P05.reverseWithRecurssion(List(1,2,3))===List(3,2,1))
  }

  test("When not an empty list with 1 elements with recurssion"){
    assert(P05.reverseWithRecurssion(List(1))===List(1))
  }

  test("When not an empty list with 5 elements with recurssion"){
    assert(P05.reverseWithRecurssion(List(1,2,3,4,5))===List(5,4,3,2,1))
  }

}
