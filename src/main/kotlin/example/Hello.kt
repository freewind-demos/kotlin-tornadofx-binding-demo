package example

import tornadofx.*

class HelloWorld : View() {
    override val root = vbox {
        val field1 = textfield()
        val field2 = textfield()
        field2.bind(field1.textProperty())
    }
}

class HelloWorldStyle : Stylesheet() {
    init {
        root {
            prefWidth = 200.px
            prefHeight = 300.px
        }
    }
}

class HelloWorldApp : App(HelloWorld::class, HelloWorldStyle::class)

fun main(args: Array<String>) {
    launch<HelloWorldApp>()
}