package test.P24

import P23.P23
import P24.P24
import org.scalatest.{BeforeAndAfter, FunSuite}

class P24Test extends FunSuite with BeforeAndAfter{

  var P24: P24=_

  before {
    P24= new P24
  }




  test("Test"){

    assert(P24.lotto(3,10).size==3)

  }

}
