package fi.shams.quoted.respository

import fi.shams.quoted.model.entity.AuthorEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository: JpaRepository<AuthorEntity, String>