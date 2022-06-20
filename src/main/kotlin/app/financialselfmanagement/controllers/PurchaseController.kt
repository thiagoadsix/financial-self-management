package app.financialselfmanagement.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("purchases")
class PurchaseController {
    @GetMapping()
    fun helloWorldPurchase(): String {
        return "Hello World Purchase"
    }
}