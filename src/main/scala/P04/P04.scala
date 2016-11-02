package P04

class P04 {

  def length(list: List[Int]): Int = {
    list.length
  }


  def lengthWithRecurssion[T](list: List[T]): Int = {

    @annotation.tailrec
    def length[T](n: Int, list: List[T]): Int =
    {
      (list) match {
        case Nil => 0
        case x :: Nil => n+1
        case _ :: tail => length(n + 1, tail)
        case _ => throw new NoSuchElementException
      }
    }
    length(0, list)
  }
}
