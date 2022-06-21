package app.financialselfmanagement.controllers

import app.financialselfmanagement.mappers.PurchaseMapper
import app.financialselfmanagement.request.PostPurchaseRequest
import app.financialselfmanagement.usescases.PurchaseUsecase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("purchases")
class PurchaseController (
    private val purchaseUsecase: PurchaseUsecase,
    private val purchaseMapper: PurchaseMapper
) {
    @PostMapping()
    fun purchase(@RequestBody request: PostPurchaseRequest) {
        purchaseUsecase.purchase(purchaseMapper.toModel(request))
    }
}