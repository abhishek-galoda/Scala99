package test.P08

import P07.P07
import P08.P08
import org.scalatest.{BeforeAndAfter, FunSuite}

class P08Test extends FunSuite with BeforeAndAfter{

  var P08: P08=_

  before {
    P08= new P08
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P08.compressRight(List(1,1,1,2,3))===List(1,2,3))
    assert(P08.compressLeft(List(1,1,1,2,3))===List(1,2,3))
  }

}
