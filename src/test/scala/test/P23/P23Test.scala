package test.P23

import P20.P20
import P23.P23
import org.scalatest.{BeforeAndAfter, FunSuite}

class P23Test extends FunSuite with BeforeAndAfter{

  var P23: P23=_

  before {
    P23= new P23
  }




  test("Test"){

    assert(P23.randomSelect(2,List(1,2,3)).size==2)
    assert(P23.randomSelect1(2,List(1,2,3)).size==2)


  }

}
