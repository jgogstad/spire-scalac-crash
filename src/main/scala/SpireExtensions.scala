import spire.math.{Bounded, IntegralOps}
import spire.implicits.*

extension [A: spire.math.Integral] (a: A) {
  def coerce: Long = implicitly[IntegralOps[A]].coerce(a)
}

extension [A: spire.math.Integral] (n: Bounded[A]) {
  // this code isn't actually correct as far as calculating sizes goes as it doesn't account for closed and open bounds
  def size: Long = spire.math.Integral[A].minus(n.upperBound.a, n.lowerBound.a).coerce
}
