package sushant.rajput.quizapp

data class Question(
    val id : Int,
    val questions : String,
    val image : Int,
    val optionOne : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    val CorrectAnswer : Int

)
