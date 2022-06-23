package app.financialselfmanagement.advice

import app.financialselfmanagement.enums.ErrorsEnum
import app.financialselfmanagement.exceptions.BadRequestExceptionResponse
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.validation.ObjectError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.util.function.Consumer


@ControllerAdvice
class ExceptionHandlerAdvice {
    private val logger: Logger = LoggerFactory.getLogger(ExceptionHandlerAdvice::class.java)

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleMethodArgumentNotValidException(ex: MethodArgumentNotValidException): ResponseEntity<BadRequestExceptionResponse> {
        val errors: HashMap<String, String> = HashMap()

        ex.bindingResult.allErrors.forEach(Consumer { error: ObjectError ->
            val errorField = (error as FieldError).field
            val errorMessage = error.getDefaultMessage()
            errors.put(errorField, errorMessage ?: "Error")
        })

        val badRequestException = BadRequestExceptionResponse(errors, ErrorsEnum.ML001.code)

        return ResponseEntity(badRequestException, HttpStatus.BAD_REQUEST)
    }

    //@ExceptionHandler(HttpMessageNotReadableException::class)
    //@Throws(
    //    IOException::class
    //)
    //fun handleValidationExceptions(ex: HttpMessageNotReadableException, request: WebRequest): ResponseEntity<BadRequestExceptionResponse> {
    //    if (ex.cause is JsonMappingException) {
    //        val exception = ex.cause as JsonMappingException
    //        val field = exception.path[0].fieldName
    //        val properties = ErrorProperties(property = field, exception.cause.toString())
    //        val error = BadRequestExceptionResponse(properties, ErrorsEnum.ML001.code)
    //        return ResponseEntity(error, HttpStatus.BAD_REQUEST)
    //    }
    //
    //    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null)
    //}
}