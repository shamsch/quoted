package fi.shams.quoted.respository

import fi.shams.quoted.model.entity.QuoteEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuoteRepository: JpaRepository<QuoteEntity, String>