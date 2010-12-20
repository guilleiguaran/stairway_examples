class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString = n + "/" + d

  def +(other: Rational): Rational = 
    new Rational(
	  this.numer * other.denom + other.numer * this.denom,
	  this.denom * other.denom
	)
	
  def +(i: Int): Rational =
   new Rational(this.numer + i * this.denom, this.denom)

  def ++(): Rational =
   this + 1

  def -(other: Rational): Rational =
    new Rational(
	  this.numer * other.denom - other.numer * this.denom, 
	  this.denom * other.denom
	)

  def -(i: Int): Rational =
    new Rational(this.numer + i * this.denom, this.denom)

  def --(): Rational =
    this - 1
  
  def *(other: Rational): Rational =
    new Rational(this.numer * other.numer, this.denom * other.denom)

  def *(i: Int): Rational =
    new Rational(this.numer * i, this.denom)

  def /(other: Rational): Rational =
    new Rational(this.numer * other.denom, this.denom * other.numer)

  def /(i: Int): Rational =
    new Rational(this.numer, this.denom * i)
	
  def compareTo(other: Rational): Int =
    (this.numer * other.denom) compareTo (other.numer * this.denom)

  def max(other: Rational) =
   if(this.compareTo(other) > 0) this else other

  def min(other: Rational) =
   if(this.compareTo(other) < 0) this else other
  
  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
}