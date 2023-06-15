@file:Suppress("UNREACHABLE_CODE")

package sushant.rajput.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val ques1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_englandflag,

            "Argentina", "England", "China",
            "France",
            2
        )
        questionsList.add(ques1)
        return questionsList


        fun getQuestions(): ArrayList<Question> {
            val questionsList = ArrayList<Question>()

            val ques2 = Question(
                1, "What country does this flag belong to?",
                R.drawable.ic_indianflag,

                "Argentina", "England", "India",
                "France",
                3
            )
            questionsList.add(ques2)
            return questionsList

            fun getQuestions(): ArrayList<Question> {
                val questionsList = ArrayList<Question>()

                val ques3 = Question(
                    1, "What country does this flag belong to?",
                    R.drawable.ic_germanyflag1,

                    "Germany", "England", "India",
                    "France",
                    1
                )
                questionsList.add(ques3)
                return questionsList


            }
        }
    }
}