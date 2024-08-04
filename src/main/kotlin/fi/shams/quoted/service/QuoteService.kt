package fi.shams.quoted.service

import fi.shams.quoted.model.entity.QuoteEntity

interface QuoteService {
    fun getQuote(id: Long): QuoteEntity
    fun getQuotes(): List<QuoteEntity>
    fun createQuote(quoteDto: QuoteEntity): QuoteEntity
    fun updateQuote(id: Long, quote: QuoteEntity): QuoteEntity
    fun deleteQuote(id: Long)
}