object Main {
  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil: List[T])((x, y) => f(y) match {
      case true => y :: x
      case false => x
    }).reverse
  }
}
