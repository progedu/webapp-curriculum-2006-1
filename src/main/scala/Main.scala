
object Main{
  def filter[T](list: List[T])(f: T => Boolean): List[T] =
    list.foldLeft(Nil: List[T]){ (x, y) => if(f(y)) y :: x else x }.reverse

  def flatten(list: List[_]) : List[Any] = list match {
    case Nil => Nil
    case (x: List[_])::xs => flatten(x) ++ flatten(xs)
    case x::xs => x :: flatten(xs)
  }

  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    def splitRec(index: Int, take: List[A], rest: List[A]): (List[A], List[A]) =
      (index, rest) match {
        case (_, Nil) => (take.reverse, Nil)
        case (0, list) => (take.reverse, rest)
        case (i, x::xs) => splitRec(i - 1, x::take, xs)
      }
    splitRec(n, Nil, list)
  }
}
