package com.example.myapplication

fun main () {
    var userChoice = true
    do {
        print("Enter Word: ")
        val word = readLine()
        val quiz = Quiz(word.toString())
        while(quiz.life > 0) {
            print("Enter Character: ")
            val character = readLine()?.toCharArray()
            quiz.readCharacter(character?.get(0))
            if (quiz.word == quiz.guessedPart) {
                println("Congratulations! Want to play again? (Y/N)")
                var input = readLine()
                userChoice = input?.capitalize() == "Y"
                quiz.life = 0
            }
        }
    } while(userChoice)
}