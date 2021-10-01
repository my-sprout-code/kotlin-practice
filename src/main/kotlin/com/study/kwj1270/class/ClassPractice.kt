package com.study.kwj1270.`class`

class ClassPractice(_nickname: String) {
    val nickname: String
    init {
        nickname = _nickname
    }
}

class ClassPractice1 constructor(_nickname: String) {
    val nickname: String
    init {
        nickname = _nickname
    }
}

class ClassPractice2(nickname: String) {
    val nickname: String
    init {
        this.nickname = nickname
    }
}

class ClassPractice3(_nickname: String) {
    val nickname: String = _nickname
}

class ClassPractice4(nickname: String) {
    val nickname: String = nickname
}

class ClassPractice5(val nickname: String)
class ClassPractice6(val nickname: String = "val default")
class ClassPractice7(var nickname: String = "var default")

fun main() {

    val classPractice: ClassPractice = ClassPractice("Hello")
    val classPractice1: ClassPractice1 = ClassPractice1("Hello")
    val classPractice2: ClassPractice2 = ClassPractice2("Hello")
    val classPractice3: ClassPractice3 = ClassPractice3("Hello")
    val classPractice4: ClassPractice4 = ClassPractice4("Hello")
    val classPractice5: ClassPractice5 = ClassPractice5("Hello")

    println(classPractice.nickname)
    println(classPractice1.nickname)
    println(classPractice2.nickname)
    println(classPractice3.nickname)
    println(classPractice4.nickname)
    println(classPractice5.nickname)
    println(ClassPractice6().nickname)
    println(ClassPractice6("not default").nickname)
    println(ClassPractice7().nickname)
    val classPractice7 = ClassPractice7()
    classPractice7.nickname = "setter"
    println(classPractice7.nickname)

}
