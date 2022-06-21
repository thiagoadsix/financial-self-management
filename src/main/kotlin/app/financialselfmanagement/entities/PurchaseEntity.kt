package app.financialselfmanagement.entities

import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "purchases")
data class PurchaseEntity(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    var id: UUID,

    @Column(name = "name")
    val name: String,

    @Column(name = "amount", nullable = false)
    var amount: BigDecimal,
)