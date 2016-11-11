package test.P21

import P20.P20
import P21.P21
import org.scalatest.{BeforeAndAfter, FunSuite}

class P21Test extends FunSuite with BeforeAndAfter{

  var P21: P21=_

  before {
    P21= new P21
  }




  test("Test"){

    assert(P21.insertAt(1,0,List(1,2,3))===List(1,0,2,3))
    assert(P21.insertAt(1,'new,  List('a, 'b, 'c, 'd))==List('a, 'new, 'b, 'c, 'd))

  }

}
