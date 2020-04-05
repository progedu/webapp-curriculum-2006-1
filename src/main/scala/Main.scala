object Main {
  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list
      .foldLeft(Nil: List[T])({ (a, b) =>
        if (f(b)) {
          b :: a
        } else {
          a
        }
      })
      .reverse
  }
}
