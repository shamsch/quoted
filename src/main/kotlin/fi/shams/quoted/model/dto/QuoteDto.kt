package fi.shams.quoted.model.dto

data class QuoteDto (
    val id: Long?,
    val text: String,
    val author: AuthorDto
)