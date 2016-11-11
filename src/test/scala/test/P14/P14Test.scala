package test.P14

import P13.P13
import P14.P14
import org.scalatest.{BeforeAndAfter, FunSuite}

class P14Test extends FunSuite with BeforeAndAfter{

  var P14: P14=_

  before {
    P14= new P14
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P14.duplicate(List(1,2,3))===List(1,1,2,2,3,3))
    assert(P14.duplicate(List(1,1,2,3))===List(1,1,1,1,2,2,3,3))

  }

}
