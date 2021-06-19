package org.s15188
package Cw2.Zad5

trait Nauczyciel extends Pracownik {
  override val podatek: BigDecimal = pensja * .1
}
