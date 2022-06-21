package app.financialselfmanagement.services

import app.financialselfmanagement.entities.PurchaseEntity
import app.financialselfmanagement.repositories.PurchaseRepository
import org.springframework.stereotype.Service

@Service
class PurchaseService (
    private var purchaseRepository: PurchaseRepository
) {
    fun purchase(data: PurchaseEntity) {
        purchaseRepository.save(data)
    }
}