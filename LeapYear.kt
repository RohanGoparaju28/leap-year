package Kotlin
import java.time.LocalDate
val years = listOf(1900, 2000, 2023, 2024, 2400)
fun isLeapwithLib(year: Int) : Boolean {
  return LocalDate.of(/* year = */ year,/* month = */ 1,/* dayOfMonth = */ 1).isLeapYear
}
fun isLeapwithoutLib(year:Int) : Boolean {
    return year%4 == 0 && year%100 == 0 || year%400 == 0
}

fun main() {
   // Checking without using inbuilt libraries.
    for(year in years) {
        if(isLeapwithoutLib(year)) println("$year is a leap year")
        else println("$year is not a leap year")
    }
    //Checking with Library
    for(year in years) {
        if(isLeapwithLib(year)) println("$year is a leap year")
        else println("$year is not a leap year")
     }
}
