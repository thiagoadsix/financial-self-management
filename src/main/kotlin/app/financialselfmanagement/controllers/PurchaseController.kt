package app.financialselfmanagement.controllers

import app.financialselfmanagement.usescases.PurchaseUsecase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("purchases")
class PurchaseController (
    private val purchaseUsecase: PurchaseUsecase
) {
    @GetMapping()
    fun helloWorldPurchase(): String {
        return purchaseUsecase.purchase()
    }
}