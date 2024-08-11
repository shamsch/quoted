package fi.shams.quoted.controller

import fi.shams.quoted.model.dto.AuthorDto
import fi.shams.quoted.service.AuthorService
import fi.shams.quoted.toAuthorDto
import fi.shams.quoted.toAuthorEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping(path = ["/v1/authors"])
class AuthorsController (private val authorService: AuthorService) {

    @PostMapping
    fun createAuthor(@RequestBody authorDto: AuthorDto): ResponseEntity<AuthorDto> {
        try {
            val res = authorService.createAuthor(authorDto.toAuthorEntity()).toAuthorDto()
            return ResponseEntity(res, HttpStatus.CREATED)
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.BAD_REQUEST)
        }
    }

    @GetMapping
    fun getAuthors(): List<AuthorDto> {
        return authorService.getAuthors().map { it.toAuthorDto() }
    }

    @GetMapping(path =["/{id}"])
    fun getAuthor(@PathVariable("id") id: Long): ResponseEntity<AuthorDto> {
        return authorService.getAuthorById(id)?.let { ResponseEntity.ok(it.toAuthorDto()) } ?: ResponseEntity.notFound().build()
    }


}