package test.P09

import P08.P08
import P09.P09
import org.scalatest.{BeforeAndAfter, FunSuite}

class P09Test extends FunSuite with BeforeAndAfter{

  var P09: P09=_

  before {
    P09= new P09
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P09.pack(List(1,1,2,2,2,3))===List(List(1,1),List(2,2,2),List(3)))

  }

}
