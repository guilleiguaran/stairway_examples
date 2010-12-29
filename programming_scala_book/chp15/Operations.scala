abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

def simplify(expr: Expr): Expr = expr match {
  case UnOp("-", UnOp("-", x)) => simplify(x)
  case BinOp("+", x, Number(0)) => simplify(x)
  case BinOp("*", x, Number(1)) => simplify(x)
  case UnOp(op, x) => UnOp(op, simplify(x))
  case BinOp(op, l, r) => BinOp(op, simplify(l), simplify(r))
  case _ => expr
}

def simplifyAdd(e: Expr) = e match {
  case BinOp("+", x, y) if x == y =>
    BinOp("*", x, Number(2))
  case _ => e
}