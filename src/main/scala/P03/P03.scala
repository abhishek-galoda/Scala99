package P03

class P03 {

  def nth(n:Int,list: List[Int]): Int = {
    list(n)
  }


  def nthWithRecurssion[T](n:Int,list: List[T]): T = (n,list) match {
    case (0,x ::_) => x
    case (n,_ :: tail) => nthWithRecurssion(n-1,tail)
    case _ => throw new NoSuchElementException
  }

}
