package test.P17

import P17.P17
import org.scalatest._

class P17Test extends FunSuite with BeforeAndAfter{

  var P17: P17=_

  before {
    P17= new P17
  }




  test("When not an empty list with 3 elements with recurssion"){

    assert(P17.split(2,List(1,2,3))===(List(1,2),List(3)))
    assert(P17.split(1,List(1,2,3))===(List(1),List(2,3)))



  }

}
