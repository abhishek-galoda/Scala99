package P17

class P17 {


  def split[A](number: Int, list: List[A]): (_, _) = {
    (list.take(number), (list.takeRight(list.length - (number))))
  }

  def split1[A](number: Int, list: List[A]): (_, _) = {
    (list.take(number), list.drop(number))
  }

}


