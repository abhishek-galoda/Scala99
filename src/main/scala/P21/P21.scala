package P21

class P21 {


  def insertAt[A](number: Int, element: A,list: List[A]): List[A] = {
    list.splitAt(number) match{
      case(left, right) => (left:+element):::right
    }

  }



}


