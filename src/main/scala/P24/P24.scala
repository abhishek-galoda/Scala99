package P24

import scala.util.Random

class P24 {

  def lotto[A](number: Int, upper: Int): List[_] = {

    if(number==0){
      Nil
    }else {
        Random.nextInt(upper) :: lotto(number - 1, upper)
    }

  }

}
