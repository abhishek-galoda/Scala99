package P15

class P15 {


  def duplicateN[A](number:Int,list: List[A]): List[_] = {
    if (list.isEmpty) Nil
    else {
      list.flatMap {
        e => List.fill(number)(e)
      }
    }
  }


}


