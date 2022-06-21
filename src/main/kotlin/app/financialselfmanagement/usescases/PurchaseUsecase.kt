package app.financialselfmanagement.usescases

import app.financialselfmanagement.entities.PurchaseEntity
import app.financialselfmanagement.services.PurchaseService
import org.springframework.stereotype.Component

@Component
class PurchaseUsecase (
    private val purchaseService:  PurchaseService
) {
    fun purchase(data: PurchaseEntity) {
        purchaseService.purchase(data)
    }
}