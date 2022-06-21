package app.financialselfmanagement.mappers

import app.financialselfmanagement.entities.PurchaseEntity
import app.financialselfmanagement.request.PostPurchaseRequest
import org.springframework.stereotype.Component

@Component
class PurchaseMapper {
    fun toModel(request: PostPurchaseRequest): PurchaseEntity {
        return PurchaseEntity(
            name = request.name,
            category = request.category,
            amount = request.amount
        )
    }
}