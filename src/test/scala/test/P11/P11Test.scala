package test.P11

import P10.P10
import P11.P11
import org.scalatest.{BeforeAndAfter, FunSuite}

class P11Test extends FunSuite with BeforeAndAfter{

  var P11: P11=_

  before {
    P11= new P11
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P11.encodeModified(List(1,1,2,2,2,3))===List((2,1),(3,2),3))
    assert(P11.encodeModified(List('a','a',2,2,2,3))===List((2,'a'),(3,2),3))

  }

}
