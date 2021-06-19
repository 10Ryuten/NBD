import org.s15188.Cw2.Zad5.{Nauczyciel, Osoba, Pracownik, Student}

val osoba = new Osoba("Ala", "Kot", 30)
println(s"Osoba: ${osoba.podatek}")

val nauczyciel = new Osoba("Kamil", "Kot", 30) with Nauczyciel
println(s"Nauczyciel: ${nauczyciel.podatek}")

val pracownik = new Osoba("Jerzy", "Kot", 30) with Pracownik
println(s"Pracownik: ${pracownik.podatek}")

val student = new Osoba("Andrzej", "Kot", 30) with Student
println(s"Student: ${student.podatek}")

val studentPracownik = new Osoba("Damian", "Kot", 30) with Student with Pracownik
println(s"StudentPracownik: ${studentPracownik.podatek}")

val pracownikStudent = new Osoba("Monika", "Kot", 30) with Pracownik with Student
println(s"PracownikStudent: ${pracownikStudent.podatek}")
