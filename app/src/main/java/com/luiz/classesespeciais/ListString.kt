package com.luiz.classesespeciais

fun main() {
    var myString = "Teste"
    var listaChar = myString.listLetter()

    listaChar.forEach{println(it)}
}

fun String.listLetter(): List<String>{
    var letterList = mutableListOf<String>()

    for (index in this){
        letterList.add(index.toString())
    }

    return letterList
}