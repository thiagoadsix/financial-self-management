package app.financialselfmanagement.request

import java.math.BigDecimal
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Positive

data class PostPurchaseRequest (
    @field:NotBlank
    var name: String,

    @field:Positive
    var amount: BigDecimal,

    @field:NotBlank
    var category: String
)