package test.P18


import P18.P18
import org.scalatest.{BeforeAndAfter, FunSuite}

class P18Test extends FunSuite with BeforeAndAfter{

  var P18: P18=_

  before {
    P18= new P18
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P18.slice(1,3,List(1,2,3))===(List(2,3)))
    assert(P18.slice(3,7, List('a','b','c','d','e','f', 'g', 'h', 'i', 'j', 'k'))===List('d', 'e', 'f', 'g'))



  }

}
