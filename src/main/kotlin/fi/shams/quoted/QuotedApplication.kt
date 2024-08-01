package fi.shams.quoted

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QuotedApplication

fun main(args: Array<String>) {
	runApplication<QuotedApplication>(*args)
}
