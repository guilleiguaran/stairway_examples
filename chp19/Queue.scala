/* Using private class

trait Queue[T]{
  def head: T
  def tail: Queue[T]
  def append(x: T): Queue[T]
}

object Queue {

  def apply[T](xs: T*): Queue[T] = new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[T](
    private val leading: List[T],
    private val trailing: List[T]
  ) extends Queue[T] {

    private def mirror =
      if(leading.isEmpty) new QueueImpl(trailing.reverse, Nil)
      else this

    def head: T = mirror.leading.head

    def tail: QueueImpl[T] = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def append(x: T) = new QueueImpl(leading, x :: trailing)
  }
}*/

/* Using private constructor */

class Queue[T] (private val leading: List[T], private val trailing: List[T]) {

  private def mirror =
    if(leading.isEmpty) new Queue(trailing.reverse, Nil)
    else this

  def head: T = mirror.leading.head

  def tail: Queue[T] = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }

  def append(x: T) = new Queue(leading, x :: trailing)

  override def toString: String = {
    val queue = leading ::: trailing.reverse
    val listString =
      if(queue.isEmpty) ""
      else queue.mkString(", ")
      "Queue(" + listString + ")"
  }
}

object Queue {
  def apply[T](xs: T*): Queue[T] = new Queue[T](xs.toList, Nil)
}
