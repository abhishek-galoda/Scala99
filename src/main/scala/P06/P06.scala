package P06

class P06 {

  def palindrome[T](list: List[T]): Boolean = {
    if(list.length==1 || list.length==0 ){
      false
    }else {
      val leftSlice: List[T] = list.slice(0, list.length / 2)
      var rightSlice :List[T]=Nil
      if (list.length % 2 != 0) {
        rightSlice = list.slice(list.length / 2 + 1, list.length).reverse
      } else {
        rightSlice = list.slice(list.length / 2, list.length).reverse
      }
      leftSlice ==rightSlice
    }
  }


  def palindromeWithRecurssion[T](list: List[T]): Boolean = {

    @annotation.tailrec
    def reverse(reversedList: List[T], list: List[T]): List[T] = {
      (list) match {
        case x :: Nil => reversedList.::(x)
        case x :: tail => reverse(reversedList.::(x), tail)
        case _ => throw new NoSuchElementException
      }
    }
    list==reverse(Nil, list)
  }


}
