import scala.annotation.tailrec
import scala.language.postfixOps

// Zad 1
val week = List("PONIEDZIAŁEK", "WTOREK", "ŚRODA",
  "CZWARTEK", "PIĄTEK", "SOBOTA", "NIEDZIELA")

println("Dni tygodnia")
println(week)

// Zad 1a
def joinByFor(week: List[String]) = {
  var forWeek = ""
  for (day <- week) {
    forWeek += s"$day, "
  }

  forWeek.dropRight(2)
}

println(joinByFor(week))

// Zad 1b
def joinDaysStartsWithP(week: List[String]) = {
  var forWeek = ""
  for (day <- week if day.startsWith("P")) {
    forWeek += s"$day, "
  }

  forWeek.dropRight(2)
}

println(joinDaysStartsWithP(week))

// Zad 1c
def joinByWhile(week: List[String]) = {
  var forWeek = ""
  var i = 0

  while (i < week.length) {
    forWeek += s"${week(i)}, "
    i += 1
  }

  forWeek.dropRight(2)
}

println(joinByWhile(week))

println("Dni tygodnia: rekurencja")
// Zad 2a
def joinByRecursion(week: List[String]): String = {

  if (week.isEmpty)
    return ""

  val tail = joinByRecursion(week.tail)
  val suffix = if (tail.isBlank) "" else s", $tail"
  s"${week.head}$suffix"
}

println(joinByRecursion(week))

// Zad 2b
def reversedJoinByRecursion(week: List[String]): String = {
  if (week.isEmpty)
    return ""

  val tail = reversedJoinByRecursion(week.tail)
  val prefix = if (tail.isBlank) "" else s"$tail, "
  s"$prefix${week.head}"
}

println(reversedJoinByRecursion(week))

// Zad 3
println("Dni tygodnia: rekurencja ogonowa")
def joinByTailRecursion(week: List[String]): String = {

  @tailrec
  def joinByTail(weekPart: List[String], result: String): String = {
    val newResult = s"$result, ${weekPart.head}"
    if (weekPart.tail.isEmpty) newResult
    else joinByTail(weekPart.tail, newResult)
  }

  if (week.isEmpty) ""
  else joinByTail(week.tail, week.head)
}

println(joinByTailRecursion(week))

println("Dni tygodnia: foldy")
// Zad 4a
def joinByFoldLeft(week: List[String]): String = {
  week.foldLeft("")(_ + ", " + _).drop(2)
}

println(joinByFoldLeft(week))

// Zad 4b
def joinByFoldRight(week: List[String]): String = {
  week.foldRight("")(_ + ", " + _).dropRight(2)
}

println(joinByFoldRight(week))

// Zad 4c
def joinDaysStartsWithPByFoldLeft(week: List[String]): String = {
  week.filter(_ startsWith "P")
    .foldLeft("") { (result, item) => s"$result, $item" }
    .drop(2)
}

println(joinDaysStartsWithPByFoldLeft(week))

// Zad 5
println("Produkty: mapy")
val prices = Map("bread" -> 3f, "milk" -> 5f, "stone" -> 10f)
println(prices)

val reduced = prices.view.mapValues(price => price * 0.9f).toMap
println(reduced)

// Zad 6
println("Krotki")
def joinTuple(tuple: (String, Float, Int)): String = {
  val (name, price, quantity) = tuple
  s"$name $price $quantity"
}

println(joinTuple("bread", 4f, 44))


// Zad 7
println("Opcje")
val mapWithNulls = Map(1 -> 5f)
println(mapWithNulls.get(1))
println(mapWithNulls.get(2))
println(mapWithNulls.getOrElse(2, 30f))

// Zad 8
println("Usuwanie zer")
def deleteZeros(list: List[Int]): List[Int] = {
  if (list.isEmpty)
    return List.empty

  if (list.head != 0) {
    list.head :: deleteZeros(list.tail)
  } else {
    deleteZeros(list.tail)
  }
}

val randomNumbers = List(0, 1, -3, -6, -5, 0, 54, 12, 0)
println(deleteZeros(randomNumbers))

// Zad 9
println("Zwiększanie o 1")
def incrementAllBy1(list: List[Int]): List[Int] = {
  list.map(_ + 1)
}

println(incrementAllBy1(randomNumbers))

// Zad 10
println("Wartość bezwzględna dla liczb z przedziału <-5, 12>")
def findAbsFromInterval(list: List[Double]): List[Double] = {
  list.filter(_ >= -5d)
    .filter(_ <= 12d)
    .map(_ abs)
}

val randomRealNumbers = List(0d, 1.5d, -3d, -5.5d, -5d, 54d, 12d, 0.3d)
println(findAbsFromInterval(randomRealNumbers))