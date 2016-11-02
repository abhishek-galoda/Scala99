package P05

class P05 {

  def reverse(list: List[Int]): List[Int] = {
    list.reverse
  }


  def reverseWithRecurssion[T](list: List[T]): List[T] = {

    @annotation.tailrec
    def reverse(reversedList: List[T], list: List[T]): List[T] = {
      (list) match {
        case x :: Nil => reversedList.::(x)
        case x :: tail => reverse(reversedList.::(x), tail)
        case _ => throw new NoSuchElementException
      }
    }
    reverse(Nil, list)
  }
}
