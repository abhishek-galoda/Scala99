package P20

class P20 {


  def dropNth[A](number: Int, list: List[A]): List[A] = {
    list.take(number)::: list.drop(number+1)
  }

  def removeAt[A](number: Int, list: List[A]): (_, _) = {
    (dropNth(number,list), list(number))
  }


}


