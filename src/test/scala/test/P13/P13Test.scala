package test.P13

import P10.P10
import P13.P13
import org.scalatest.{BeforeAndAfter, FunSuite}

class P13Test extends FunSuite with BeforeAndAfter{

  var P13: P13=_

  before {
    P13= new P13
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P13.encodeDirect(List(1,1,2,2,2,3))===List((2,1),(3,2),(1,3)))

  }

}
