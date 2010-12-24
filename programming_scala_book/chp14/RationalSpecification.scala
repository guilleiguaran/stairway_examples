import org.specs._

object RationalSpecification extends Specification {
  "A Rational" should {
	val r1 = new Rational(1, 2)
	val r2 = new Rational(1, 2)
	"have a numerator equal to the passed value" in {
		r1.numer must be_==(1)
	}
	"have a denominator equal to the passed value" in {
		r1.denom must be_==(2)
	}
	"have a formated representation in n/d format" in {
		r1.toString must be_==("1/2")
	}
	"be summed with other rational number" in {
		val r3 = r1 + r2
		r3.toString must be_==("4/4")
	}
	"be substracted with other rational number" in {
		val r3 = r1 - r2
		r3.toString must be_==("0/4")
	}
  }
}