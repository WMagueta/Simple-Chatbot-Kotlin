package bot

import java.util.Scanner

val scanner = Scanner(System.`in`) 

fun main() {
    greet("Zorgtron", "2023")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) { // Greets the user with the given birthyear and name
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() { // Asks for the user name and compliments it
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() { // Guesses the user's age by getting the remainders of dividing his age by 3, 5 and 7
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() { // Counts up to any number that the user inputs;
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        println(i)
    }
}

fun test() { // Asks the user a question, and ends the loop when the correct answer is inputed.
    var answer = 0
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    while (answer != 2) {
        answer = readln().toInt()
        if (answer != 2) {
            println("Please, try again.")
        } else {
            println("Congratulations, have a nice day!")
        }
    }
}

fun end() {
    println("Congratulations, have a nice day!") 
}
