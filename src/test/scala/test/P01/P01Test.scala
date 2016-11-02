package test.P01

import P01.P01
import org.scalatest.{BeforeAndAfter, FunSuite}

class P01Test extends FunSuite with BeforeAndAfter{

  var P01:P01=_

  before {
    P01= new P01
  }

  test("When not an empty list"){
    assert(P01.last(List(1,2,3))==3)
  }


  test("When not an empty list and used recurrsion"){
    assert(P01.lastWithRecurssion(List(1,2,3))==3)
  }

  test("When an empty list and used recurrsion"){
    assertThrows[NoSuchElementException]{(P01.lastWithRecurssion(List()))}
  }

  test("When an empty list and not used recurrsion"){
    assertThrows[NoSuchElementException]{(P01.last(List()))}
  }

  after{
    P01=null
  }
}
