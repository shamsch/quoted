package fi.shams.quoted.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "quotes")
data class Quote(
    @Id @Column(name = "id") val id: String,

    @Column(name = "quote") val quote: String,

    @ManyToOne(cascade = [CascadeType.DETACH]) @JoinColumn(name = "author_id") val author: Author

)