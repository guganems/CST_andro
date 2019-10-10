package com.example.myapplication

class Quiz(var word : String) {
    var guessedPart = ""
    var life = 8

    init {
        println("Game is starting..")
        println(livesRemaining())
        println(currentWord())
        for (i in 0 until word.length) {
            guessedPart += "_"
        }
    }

    fun livesRemaining() : Int {
        return life
    }

    fun currentWord() : String {
        return guessedPart
    }

    fun readCharacter(character: Char?) {
        if (this.word.contains(character!!)) {
            println("Yes, it's there!!")
            modifyGuessedPart(character)
            println(currentWord())
        }
        else {
            removeLife()
            println(livesRemaining())
        }
    }

    fun removeLife() {
        this.life--
        println("There is no such character!")
        if (life == 0) gameOver()
    }

    fun gameOver() : Boolean {
        println("Sorry, you lost… Want to play again? (Y/N)")
        val userChoice = readLine()
        return userChoice!!.capitalize() == "Y"
    }

    fun modifyGuessedPart (character: Char) {
        var newGuessed : String = ""
        val index = word.indexOf(character)
        for (i in 0 until guessedPart.length) {
            if (this.word[i] == character) {
                newGuessed += character
            }
            else newGuessed += guessedPart[i]
        }
        guessedPart = newGuessed
    }
}
