package fi.shams.quoted.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "quotes")
data class QuoteEntity(
    @Id @Column(name = "id") @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "quote_id_seq"
    )
    val id: Long?,

    @Column(name = "quote") val quote: String,

    @ManyToOne(cascade = [CascadeType.DETACH]) @JoinColumn(name = "author_id") val author: AuthorEntity

)