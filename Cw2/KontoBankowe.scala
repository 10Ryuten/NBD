package org.s15188
package Cw2

class KontoBankowe(poczatkowyStanKonta: BigDecimal) {
  private var _stanKonta: BigDecimal = poczatkowyStanKonta

  def stanKonta: BigDecimal = _stanKonta

  def this() {
    this(0)
  }

  def wplata(value: BigDecimal): Unit = {
    if (value < 0) {
      throw new Exception("Wpłata nie może być ujemna");
    } else {
      _stanKonta = _stanKonta + value
    }
  }

  def wyplata(value: BigDecimal): Unit = {
    if (value < 0) {
      throw new Exception("Wypłata nie może być ujemna");
    } else if (stanKonta < value) {
      throw new Exception("Za mało środków do wypłaty");
    } else {
      _stanKonta = _stanKonta - value
    }
  }
}
