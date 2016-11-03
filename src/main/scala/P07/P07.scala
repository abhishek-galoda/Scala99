package P07

class P07 {

  def flatten[T](ls: List[T]): List[T] = ls.flatMap {
    case list: List[T] => flatten(list)
    case e => List(e)
  }
}
