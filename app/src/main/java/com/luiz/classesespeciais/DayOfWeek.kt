package com.luiz.classesespeciais

fun main() {
    val otherClass = OtherClass()

    UtilityHelper.currentDay()
    UtilityHelper.setCurrentDay(DayOfWeek.SATURDAY)
    UtilityHelper.currentDay()
    println(otherClass.isWeekend())
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    println(otherClass.isWeekend())
    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    println(otherClass.isWeekend())



}

class OtherClass(){
    init{
        UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    }

    fun isWeekend(): Boolean{
        val currentDay = UtilityHelper.currentDay()
        return currentDay == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY
    }
}

object UtilityHelper{
    private var dayOfWeek: DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(newDayOfWeek: DayOfWeek){
        this.dayOfWeek = newDayOfWeek
    }

    fun currentDay():DayOfWeek{
        println(dayOfWeek)
        return dayOfWeek
    }
}

enum class DayOfWeek(val trasnlate: String){
    SUNDAY("Domingo"),
    MONDAY("Segunda-Feira"),
    TUESDAY("Terça-Feira"),
    WENDNESDAY("Quarta-Feira"),
    THURSDAY("Quinta-Feira"),
    FRIDAY("Sext-Feira"),
    SATURDAY("Sábado")
}