package test.P16

import P15.P15
import P16.P16
import org.scalatest.{BeforeAndAfter, FunSuite}

class P16Test extends FunSuite with BeforeAndAfter{

  var P16: P16=_

  before {
    P16= new P16
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P16.drop(2,List(1,2,3,4,5))===List(1,3,5))
    assert(P16.drop(3,List(1,2,3))===List(1,2))
    assert(P16.drop(1,List(1,2,3))===List())


  }

}
