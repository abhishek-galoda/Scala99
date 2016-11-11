package P19

class P19 {


  def rotate[A](number: Int, list: List[A]): List[A] = {

    if(number>0)
      list.drop(number):::list.take(number)
    else
      list.drop(list.size+number):::list.take(list.size+number)
  }




}


