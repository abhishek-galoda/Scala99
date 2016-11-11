package test.P19

import P18.P18
import P19.P19
import org.scalatest.{BeforeAndAfter, FunSuite}

class P19Test extends FunSuite with BeforeAndAfter{

  var P19: P19=_

  before {
    P19= new P19
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P19.rotate(1,List(1,2,3))===(List(2,3,1)))
    assert(P19.rotate(2,List(1,2,3))===(List(3,1,2)))

    assert(P19.rotate(-1,List(1,2,3))===(List(3,1,2)))
    assert(P19.rotate(-2,List(1,2,3))===(List(2,3,1)))


  }

}
