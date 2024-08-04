package fi.shams.quoted.controller

import fi.shams.quoted.model.dto.AuthorDto
import fi.shams.quoted.service.AuthorService
import fi.shams.quoted.toAuthorDto
import fi.shams.quoted.toAuthorEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController (private val authorService: AuthorService) {

    @PostMapping("/authors")
    fun createAuthor(@RequestBody authorDto: AuthorDto): AuthorDto {
        return authorService.createAuthor(authorDto.toAuthorEntity()).toAuthorDto()
    }
}