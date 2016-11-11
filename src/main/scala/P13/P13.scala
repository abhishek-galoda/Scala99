package P13

class P13 {


  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
      val (packed, next) = list span { _ == list.head }
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }


}


