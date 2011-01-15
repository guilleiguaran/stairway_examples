def append[T](xs: List[T], ys: List[T]): List[T] = {
	xs match {
		case List() => ys
		case x :: xs1 => x :: append(xs1, ys)
	}
}

def reverse[T](xs: List[T]) = (List[T]() /: xs) {(ys, y) => y :: ys}