package fi.shams.quoted

import fi.shams.quoted.model.dto.AuthorDto
import fi.shams.quoted.model.dto.QuoteDto
import fi.shams.quoted.model.entity.AuthorEntity
import fi.shams.quoted.model.entity.QuoteEntity

fun AuthorEntity.toAuthorDto() = AuthorDto(
    id = this.id,
    name = this.name
)

fun AuthorDto.toAuthorEntity() = AuthorEntity(
    id = this.id,
    name = this.name
)

fun QuoteEntity.toQuoteDto() = QuoteDto(
    id = this.id,
    text = this.quote,
    author = this.author.toAuthorDto()
)

fun QuoteDto.toQuoteEntity() = QuoteEntity(
    id = this.id,
    quote = this.text,
    author = this.author.toAuthorEntity()
)
