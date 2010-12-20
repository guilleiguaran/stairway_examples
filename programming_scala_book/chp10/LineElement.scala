/* old
class LineElement(s: String) extends ArrayElement(Array(s)) {
	override def width = s.length
	override def height = 1
}
*/

class LineElement(s: String) extends Element {
	val contents = Array(s)
	override def width = s.length
	override def height = 1
}