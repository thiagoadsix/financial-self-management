package app.financialselfmanagement.usescases

import org.springframework.stereotype.Component

@Component
class PurchaseUsecase {
    fun purchase(): String {
        return "Doing a purchase"
    }
}