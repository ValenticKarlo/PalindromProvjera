fun checkPalindrome (sentence: String): Boolean{
    val sentenceFilter = sentence.filter { it.isLetter() }

    val sentenceToLower = sentenceFilter.map { it.lowercaseChar() }

    var beginningOfString = 0
    var endOfString: Int = sentenceToLower.size - 1

    while(beginningOfString<=endOfString){
        if(sentenceToLower[beginningOfString] == sentenceToLower[endOfString] ){
            beginningOfString += 1
            endOfString -= 1
        }
        else {
            return false
        }
    }
    return true
}

fun getUserInput ( ) : String {
    var loop = false
    var userSentence = ""

    while (!loop) {
        println("Unesite recenicu za provjeru: ")

        val userInput = readLine()
        if (userInput != null ) {
            loop = true
            userSentence = userInput
        }
        if(!loop) {println("Krivi unos!!")}
    }
    return userSentence
}

fun main () {
    val sentence: String = getUserInput()
    val yesOrNo = checkPalindrome(sentence)
    if (yesOrNo) { println("Recenica je palindrom.") }
    else { println("Recenica nije palindrom.") }
}