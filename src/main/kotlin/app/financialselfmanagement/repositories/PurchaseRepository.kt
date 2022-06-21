package app.financialselfmanagement.repositories

import app.financialselfmanagement.entities.PurchaseEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PurchaseRepository : JpaRepository<PurchaseEntity, UUID> {}