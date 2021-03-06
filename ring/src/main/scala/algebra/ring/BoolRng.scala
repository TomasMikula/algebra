package algebra
package ring

/**
 * A Boolean rng is a rng whose multiplication is idempotent, that is
 * `a⋅a = a` for all elements ''a''. This property also implies `a+a = 0`
 * for all ''a'', and `a⋅b = b⋅a` (commutativity of multiplication).
 *
 * Every `BoolRng` is equivalent to [[algebra.lattice.GenBool]].
 * See [[GenBoolFromBoolRng]] for details.
 */
trait BoolRng[A] extends Any with Rng[A] { self =>
  override final def negate(x: A): A = x
}

object BoolRng extends AdditiveGroupFunctions with MultiplicativeSemigroupFunctions {
  @inline final def apply[A](implicit r: BoolRng[A]): BoolRng[A] = r
}
