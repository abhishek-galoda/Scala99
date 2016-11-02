package P01

class P01 {

  def last(list: List[Int]): Int = {
    list.last
  }

  def lastWithRecurssion[T](list: List[T]): T = list match {
    case h :: Nil => h
    case _ :: tail => lastWithRecurssion(tail)
    case _ => throw new NoSuchElementException
  }

}


object P01 {

  def main(args: Array[String]) {

    val list = List(1, 2, 3, 4, 5)
    println("Last element of list is " + new P01().last(list))
    println("Last element of list with recurssion is " + new P01().lastWithRecurssion(list))

  }
}





