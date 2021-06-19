package org.s15188
package Cw2.Zad5

trait Pracownik extends Osoba {
  var pensja: BigDecimal = 1000
  override val podatek: BigDecimal = pensja * .2
}
