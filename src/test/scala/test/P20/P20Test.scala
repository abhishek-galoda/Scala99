package test.P20

import P19.P19
import P20.P20
import org.scalatest.{BeforeAndAfter, FunSuite}

class P20Test extends FunSuite with BeforeAndAfter{

  var P20: P20=_

  before {
    P20= new P20
  }




  test("Test"){

    assert(P20.removeAt(1,List(1,2,3))===(List(1,3),2))
    assert(P20.removeAt(2,List(1,2,3))===(List(1,2),3))


  }

}
