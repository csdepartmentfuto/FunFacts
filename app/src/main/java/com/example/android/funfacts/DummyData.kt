package com.example.android.funfacts

object DummyData {

    val facts = listOf<FactModel>(

        FactModel (
            "JavaScript",
            R.drawable.js_logo,
            "NaN (Not a number) is being a number. Also, NaN is not equal to itself. Actually NaN not equal to anything. The only way to verify anything is NaN or not by isNaN()."
        ),

        FactModel (
            "Java",
            R.drawable.java_logo,
            "The original name for Java was Oak. It was eventually changed to Java by Sun's marketing department when Sun lawyers found that there was already a computer company registered as Oak. But a legend has it that Gosling and his gang of programmers went out to the local cafe to discuss names and ended up naming it Java. There seems to be some truth in this as the ‘0xCafeBabe’ magic number in the class files was named after the Cafe where the Java team used to go for coffee."
        ),

        FactModel (
            "Kotlin",
            R.drawable.kotlin_logo,
            "Kotlin has no new. In Kotlin ; is not mandatory."
        ),

        FactModel (
            "Python",
            R.drawable.python_logo,
            "The language’s name isn’t about snakes, but about the popular British comedy troupe Monty Python (from the 1970s). Guido himself is a big fan of Monty Python’s Flying Circus. Being in a rather irreverent mood, he named the project ‘Python’. Isn’t it an interesting Python fact?"
        ),

        FactModel (
            "PHP",
            R.drawable.php_logo,
            "Who says mascots are limited to sports teams? Several popular programming languages, including PHP and Java, also have mascots. Java’s mascot is a black, white and red cartoon character named Duke, while PHP’s mascot is a big blue elephant that’s aptly named elePHPant."
        )

        )
}