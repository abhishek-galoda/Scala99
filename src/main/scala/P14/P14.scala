package P14

class P14 {


  def duplicate[A](list: List[A]): List[_] = {
    if (list.isEmpty) Nil
    else {
      list.flatMap {
        e => List(e,e)
      }
    }
  }


}


