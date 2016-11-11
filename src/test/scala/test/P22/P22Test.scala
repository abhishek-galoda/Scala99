package test.P22

import P21.P21
import P22.P22
import org.scalatest.{BeforeAndAfter, FunSuite}

class P22Test extends FunSuite with BeforeAndAfter{

  var P22: P22=_

  before {
    P22= new P22
  }




  test("Test"){

    assert(P22.range(4,9)==List(4,5,6,7,8,9))

  }

}
