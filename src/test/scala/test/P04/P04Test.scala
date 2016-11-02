package test.P04

import P03.P03
import P04.P04
import org.scalatest.{BeforeAndAfter, FunSuite}

class P04Test extends FunSuite with BeforeAndAfter{

  var P04:P04=_

  before {
    P04= new P04
  }

  test("When not an empty list"){
    assert(P04.length(List(1,2,3))==3)
  }


  test("When not an empty list with 5 elements with recurssion"){
    assert(P04.lengthWithRecurssion(List(1,2,3,4,5))==5)
  }

  test("When  an empty list with 0 elements with recurssion"){
    assert(P04.lengthWithRecurssion(List())==0)
  }


}
