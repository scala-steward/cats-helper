package com.evolutiongaming.catshelper

import cats.kernel.Eq
import cats.{Order, Show}

final case class RandomId(value: String) extends AnyVal {
  override def toString = value
}

object RandomId {
  implicit val eqRandomId: Eq[RandomId] = Eq.fromUniversalEquals

  implicit val showRandomId: Show[RandomId] = Show.fromToString

  implicit val orderingRandomId: Ordering[RandomId] = Ordering.by(_.value )

  implicit val orderRandomId: Order[RandomId] = Order.fromOrdering
}
