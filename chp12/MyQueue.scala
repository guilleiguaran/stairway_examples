import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
	def get(): Int
	def put(x: Int)
}

trait Doubling extends IntQueue {
	abstract override def put(x: Int){ super.put(2*x) }
}

trait Incrementing extends IntQueue {
	abstract override def put(x: Int) { super.put(x + 1) }
}

trait Filtering extends IntQueue {
	abstract override def put(x: Int) {
		if(x >= 0) super.put(x)
	}
}

class BasicIntQueue extends IntQueue {
	private val buf = new ArrayBuffer[Int]
	def get() = buf.remove(0)
	def put(x: Int){ buf += x }
}

class MyQueue extends BasicIntQueue with Incrementing with Doubling with Filtering