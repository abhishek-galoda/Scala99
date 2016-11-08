package test.P12

import P12.P12
import org.scalatest.{BeforeAndAfter, FunSuite}

class P12Test extends FunSuite with BeforeAndAfter {

  var P12: P12 = _

  before {
    P12 = new P12
  }

  test("Test For ") {

    assert(P12.decode(List((4,'a'),(1,'b'),(2,'c'),(2, 'a'), (1, 'd'), (4, 'e'))) === List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    assert(P12.decode2(List((4,'a'),(1,'b'),(2,'c'),(2, 'a'), (1, 'd'), (4, 'e'))) === List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    assert(P12.decode3(List((4,'a'),(1,'b'),(2,'c'),(2, 'a'), (1, 'd'), (4, 'e'))) === List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))


  }

}
