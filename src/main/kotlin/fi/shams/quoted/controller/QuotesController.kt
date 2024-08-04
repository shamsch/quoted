package fi.shams.quoted.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class QuotesController {

    @PostMapping("/quotes")
    fun createQuote() {
        // TODO
    }
}