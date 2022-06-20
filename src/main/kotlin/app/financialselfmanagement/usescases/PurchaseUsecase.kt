package app.financialselfmanagement.usescases

import app.financialselfmanagement.services.PurchaseService
import org.springframework.stereotype.Component

@Component
class PurchaseUsecase (
    private val purchaseService:  PurchaseService
) {
    fun purchase() {
        purchaseService.purchase()
    }
}