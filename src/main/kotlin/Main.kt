import kotlin.random.Random

fun main() {
    var score = 0
    var count = 1

    do{
        val num1 = Random.nextInt(1,10)
        val num2 = Random.nextInt(1,10)
        val sum = (num1 + num2).toString()

        println("Question $count. What is $num1 + $num2? Type your answer as a number, do not spell the number.")
        if ((readLine().toString().lowercase()).equals(sum)){
            score++
        }
        count++

    } while (count != 6)

    println("Congratulations! Your score was $score/5")
}