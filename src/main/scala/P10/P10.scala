package P10

class P10 {


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

  def encode[A](list: List[A]): List[(Int, A)] = {
    pack(list).map { e => (e.length, e.head) }
  }
}
