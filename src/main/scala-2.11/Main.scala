object Main {
  def filter[T](list: List[T])(f: T => Boolean): List[T] =
    list.foldLeft(Nil: List[T])((x,y) => if (f(y)) y::x else x).reverse
}