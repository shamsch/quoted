package fi.shams.quoted.service.impl

import fi.shams.quoted.model.entity.AuthorEntity
import fi.shams.quoted.respository.AuthorRepository
import fi.shams.quoted.service.AuthorService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository): AuthorService {
    override fun getAuthors(): List<AuthorEntity> {
        return authorRepository.findAll()
    }

    override fun createAuthor(author: AuthorEntity): AuthorEntity {
       return authorRepository.save(author)
    }

    override fun updateAuthor(id: Long, author: AuthorEntity): AuthorEntity {
        TODO("Not yet implemented")
    }

    override fun deleteAuthor(id: Long) {
        TODO("Not yet implemented")
    }

    override fun getAuthorById(id: Long): AuthorEntity? {
       return authorRepository.findByIdOrNull(id.toString())
    }
}