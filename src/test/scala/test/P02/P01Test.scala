package test.P02

import P01.P01
import P02.P02
import org.scalatest.{BeforeAndAfter, FunSuite}

class P02Test extends FunSuite with BeforeAndAfter{

  var P02:P02=_

  before {
    P02= new P02
  }

  test("When not an empty list"){
    assert(P02.penultimate(List(1,2,3))==2)
  }

  test("When not an empty list with 5 elements"){
    assert(P02.penultimate(List(1,2,3,4,5))==4)
  }


  test("When not an empty list with 5 elements with recurssion"){
    assert(P02.penultimateWithRecurssion(List(1,2,3,4,5))==4)
  }


}
