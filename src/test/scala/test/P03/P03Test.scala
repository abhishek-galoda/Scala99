package test.P03

import P02.P02
import P03.P03
import org.scalatest.{BeforeAndAfter, FunSuite}

class P03Test extends FunSuite with BeforeAndAfter{

  var P03:P03=_

  before {
    P03= new P03
  }

  test("When not an empty list"){
    assert(P03.nth(1,List(1,2,3))==2)
  }

  test("When not an empty list with 5 elements"){
    assert(P03.nth(3,List(1,2,3,4,5))==4)
  }


  test("When not an empty list with 5 elements with recurssion"){
    assert(P03.nthWithRecurssion(3,List(1,2,3,4,5))==4)
  }


}
