package com.study.kwj1270

class VariableTest {
    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"     // 타입 추론
    val question2:String = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"     // 명시적으로 입력 가능하다.

    val answer = 62
    val answer2: Int = 62
    var answer3: Int = 10

    val yearsToCompute = 7.5e6 // 더블 타입도 가능하다.
//    val stringAnswer:String = (6 + "2") // 숫자 + 문자는 안된다
    val stringAnswer:String = ("6" + "2") // 문자 + 문자는 된다


    fun variableTest() {
        val answer4:Int
        answer4 = 10
//        answer4 = 109 -> val은 재할당 불가


        var answer5: Int = 1
        answer5 = 10

        var answer6: Int
        answer6 = 10

    //        var answer7: Int
    //        answer7: String

    }



    fun addSum(a:Int, b:Int) = (a+b)

}