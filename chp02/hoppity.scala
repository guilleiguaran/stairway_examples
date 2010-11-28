import scala.io.Source

def hop(x: Int): Unit = {
  if(x % 5 == 0 && x % 3 == 0) println("Hop")
  else if(x % 5 == 0) println("Hophop")
  else if(x % 3 == 0) println("Hoppity")
}

var number = Source.fromFile(args(0)).getLines.toList(0).toInt

(1 to number).foreach(hop)