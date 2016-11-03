package test.P07

import P07.P07
import org.scalatest.{BeforeAndAfter, FunSuite}

class P07Test extends FunSuite with BeforeAndAfter{

  var P07: P07=_

  before {
    P07= new P07
  }




  test("When not an empty list with 3 elements with recurssion"){

//    assert(P07.flatten(List(1,2,3))===List(1,2,3))
    assert(P07.flatten(List(1,List(2,3)))===List(1,2,3))

  }

}
