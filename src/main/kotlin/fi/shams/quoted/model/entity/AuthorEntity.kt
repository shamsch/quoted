package fi.shams.quoted.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "authors")
data class AuthorEntity(
    @Id @Column(name = "id") @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "author_id_seq"
    ) val id: Long?,

    @Column(name = "name") val name: String
)