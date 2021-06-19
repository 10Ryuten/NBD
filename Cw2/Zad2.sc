import org.s15188.Cw2.{KontoBankowe, Osoba}

// Zad 1
def dayPatternMatching(day: String) = {
  day.toUpperCase match {
    case "PONIEDZIAŁEK" | "WTOREK" | "ŚRODA" | "CZWARTEK" | "PIĄTEK" => "Praca"
    case "SOBOTA" | "NIEDZIELA" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}

println(dayPatternMatching("wtorek"))
println(dayPatternMatching("sobota"))
println(dayPatternMatching("zly dzien"))


// Zad 2
val pusteKontoBankowe = new KontoBankowe();
println(pusteKontoBankowe.stanKonta)

val kontoBankowe = new KontoBankowe(100);
println(kontoBankowe.stanKonta)
kontoBankowe.wplata(300)
println(kontoBankowe.stanKonta)
kontoBankowe.wyplata(150)
println(kontoBankowe.stanKonta)


// Zad 3
def greetPerson(osoba: Osoba): String = osoba match {
  case Osoba("Ania", "Zegar") => "Hej, Aniu"
  case Osoba("John", "Smith") => "Hi! John"
  case _ => "Witaj, nieznajomy"
}

val ania = Osoba("Ania", "Zegar")
val john = Osoba("John", "Smith")
val emil = Osoba("Emil", "Smith")

println(greetPerson(ania))
println(greetPerson(john))
println(greetPerson(emil))


// Zad 4
def tripleFunction(value: Int, mapper: Int => Int): Int = {
  mapper(mapper(mapper(value)))
}

println(tripleFunction(2, x => 2 * x))





