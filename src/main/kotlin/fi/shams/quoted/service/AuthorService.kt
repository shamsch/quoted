package fi.shams.quoted.service

import fi.shams.quoted.model.entity.AuthorEntity

interface AuthorService {
    fun getAuthors(): List<AuthorEntity>
    fun createAuthor(author: AuthorEntity): AuthorEntity
    fun updateAuthor(id: Long, author: AuthorEntity): AuthorEntity
    fun deleteAuthor(id: Long)
    fun getAuthorById(id: Long): AuthorEntity?
}