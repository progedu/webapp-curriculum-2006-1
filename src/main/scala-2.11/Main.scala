object Main {
  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil: List[T]) {(a, b) =>
      f(b) match {
        case true => b::a
        case _ => filter(a)(f)
      }
    }.reverse
  }
}
