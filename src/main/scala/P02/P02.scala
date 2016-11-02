package P02


class P02 {

  def penultimate(list: List[Int]): Int = {
    list.init.last
  }


  def penultimateWithRecurssion[T](list: List[T]): T = list match {
    case x ::y ::Nil => x
    case _ :: tail => penultimateWithRecurssion(tail)
    case _ => throw new NoSuchElementException
  }

}
