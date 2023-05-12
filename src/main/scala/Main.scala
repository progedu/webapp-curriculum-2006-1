object Main {
  def filter[T](list: List[T])(act: T => Boolean): List[T] = {
    list.foldLeft(Nil: List[T])((l, x) => if (act(x)) l :+ x else l)
  }
}
