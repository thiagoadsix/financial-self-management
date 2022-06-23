package app.financialselfmanagement.controllers

import app.financialselfmanagement.mappers.PurchaseMapper
import app.financialselfmanagement.request.PostPurchaseRequest
import app.financialselfmanagement.usescases.PurchaseUsecase
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("purchases")
class PurchaseController (
    private val purchaseUsecase: PurchaseUsecase,
    private val purchaseMapper: PurchaseMapper
) {
    private val logger: Logger = LoggerFactory.getLogger(PurchaseController::class.java)

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    fun purchase(@Valid @RequestBody request: PostPurchaseRequest) {
        purchaseUsecase.purchase(purchaseMapper.toModel(request))
    }
}