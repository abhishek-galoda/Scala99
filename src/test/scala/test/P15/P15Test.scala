package test.P15

import P14.P14
import P15.P15
import org.scalatest.{BeforeAndAfter, FunSuite}

class P15Test extends FunSuite with BeforeAndAfter{

  var P15: P15=_

  before {
    P15= new P15
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P15.duplicateN(2,List(1,2,3))===List(1,1,2,2,3,3))
    assert(P15.duplicateN(3,List(1,2))===List(1,1,1,2,2,2))

  }

}
