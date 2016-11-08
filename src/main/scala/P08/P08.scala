package P08

class P08 {

  def compressRight[A](list: List[A]): List[A] =
    list.foldRight(List[A]()) {
      (x, y) => if (y.isEmpty || y.head != x) x :: y else y
    }

  def compressLeft[A](list: List[A]): List[A] =
    list.foldLeft(List[A]()) {
      (x, y) => if (x.isEmpty || x.head != y) x:+y else x
    }

}
