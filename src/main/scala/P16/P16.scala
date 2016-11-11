package P16

class P16 {


  def drop[A](number:Int,list: List[A]): List[_] = {
    if (list.isEmpty) Nil
    else {
      list.zipWithIndex.filter(x => (x._2+1)%number!=0).map(x=>x._1)

    }
  }


}


