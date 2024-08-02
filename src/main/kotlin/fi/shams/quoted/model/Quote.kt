package fi.shams.quoted.model

import jakarta.persistence.*

@Entity
@Table(name = "quotes")
data class Quote(
    @Id @Column(name = "id") @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "quote_id_seq"
    )
    val id: String,

    @Column(name = "quote") val quote: String,

    @ManyToOne(cascade = [CascadeType.DETACH]) @JoinColumn(name = "author_id") val author: Author

)