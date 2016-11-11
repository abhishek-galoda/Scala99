package P23

import scala.util.Random

class P23 {

  def dropNth[A](number: Int, list: List[A]): List[A] = {
    list.take(number) ::: list.drop(number + 1)
  }

  def removeAt[A](number: Int, list: List[A]): (List[A], A) = {
    (dropNth(number, list), list(number))
  }


  def randomSelect[A](number: Int, list: List[A]): List[A] = {
    if (number <= 0) Nil
    else {
      val (rest, e) = removeAt(Random.nextInt(list.length), list)
      e :: randomSelect(number - 1, rest)
    }
  }

  def randomSelect1[A](number: Int, list: List[A]): List[A] = {
    List.fill(number)(removeAt(Random.nextInt(list.length),list)._2)
    }


  }


