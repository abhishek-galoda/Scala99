package test.P10

import P09.P09
import P10.P10
import org.scalatest.{BeforeAndAfter, FunSuite}

class P10Test extends FunSuite with BeforeAndAfter{

  var P10: P10=_

  before {
    P10= new P10
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P10.encode(List(1,1,2,2,2,3))===List((2,1),(3,2),(1,3)))

  }

}
