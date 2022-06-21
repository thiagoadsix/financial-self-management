package app.financialselfmanagement.request

import org.jetbrains.annotations.NotNull
import java.math.BigDecimal

data class PostPurchaseRequest (
    @field:NotNull("Property name could not be null.")
    val name: String,

    @field:NotNull("Property name could not be null.")
    val amount: BigDecimal,

    @field:NotNull("Property name could not be null.")
    val category: String
)