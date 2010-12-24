import org.specs._

object RationalSpecification extends Specification {
  "A Rational" should {
	"have a numerator equal to the passed value" in {
		val number = new Rational(1, 2)
		number.numer must be_==(1)
	}
	"have a denominator requal to the passed value" in {
		val number = new Rational(1, 2)
		number.denom must be_==(2)
	}
  }
}