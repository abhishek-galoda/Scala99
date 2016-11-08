package P12

class P12 {

  def decode[A](list: List[(Int, A)]): List[_] = {
    list.map { e => {
      for (i <- 1 to e._1)
        yield (e._2)
    }
    }.flatten

  }


  def decode2[A](list: List[(Int, A)]): List[_] = {
    list.flatMap { e => {
      for (i <- 1 to e._1)
        yield (e._2)
    }
    }
  }


  def decode3[A](list: List[(Int, A)]): List[_] = {
    list.flatMap { e => {
      List.fill(e._1)(e._2)
    }

    }
  }


}


