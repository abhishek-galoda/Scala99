package P11

class P11 {


  private def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span {
        _ == ls.head
      }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }


  def encodeModified[A](list: List[A]): List[_] = {
    pack(list).map { e => if (e.length > 1) {
      (e.length, e.head)
    } else {
      e.head
    }
    }
  }

//  By tuple
  def encode[A](list: List[A]): List[(Int, A)] = {
    pack(list).map { e => (e.length, e.head) }
  }



  def encodeModified2[A](ls: List[A]): List[Any] =
    encode(ls) map { t => if (t._1 == 1) t._2 else t }

}
