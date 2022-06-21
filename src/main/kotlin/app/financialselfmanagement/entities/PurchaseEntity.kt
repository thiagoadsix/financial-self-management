package app.financialselfmanagement.entities

import org.hibernate.annotations.Type
import java.math.BigDecimal
import java.util.UUID
import javax.persistence.*

@Entity(name = "purchases")
data class PurchaseEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    @Type(type = "org.hibernate.type.PostgresUUIDType")
    var id: UUID,

    @Column(name = "name")
    val name: String,

    @Column(name = "amount", nullable = false)
    var amount: BigDecimal,

    @Column(name = "category")
    val category: String,
)