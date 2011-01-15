def quickSort(list: List[Int]): List[Int] = list match {
  case x::xs => quickSort(xs.filter(_ < x)) ::: x :: quickSort(xs.filter(_ >= x))
  case Nil => Nil
}