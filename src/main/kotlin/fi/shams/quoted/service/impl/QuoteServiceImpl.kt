package fi.shams.quoted.service.impl

import fi.shams.quoted.model.entity.QuoteEntity
import fi.shams.quoted.respository.QuoteRepository
import fi.shams.quoted.service.QuoteService
import org.springframework.stereotype.Service

@Service
class QuoteServiceImpl (private val quoteRepository: QuoteRepository) : QuoteService {
    override fun getQuote(id: Long): QuoteEntity {
        TODO("Not yet implemented")
    }

    override fun getQuotes(): List<QuoteEntity> {
        TODO("Not yet implemented")
    }

    override fun createQuote(quoteDto: QuoteEntity): QuoteEntity {
        TODO("Not yet implemented")
    }

    override fun updateQuote(id: Long, quote: QuoteEntity): QuoteEntity {
        TODO("Not yet implemented")
    }

    override fun deleteQuote(id: Long) {
        TODO("Not yet implemented")
    }
}