package app.financialselfmanagement.exceptions

data class BadRequestExceptionResponse(val errors: HashMap<String, String>, val internalCode: String)

/*
* errors: [
*   {
*       property: category,
*       value: null,
*       message: must no be null
*   }
* ],
* internalCode: M1-001
*
* -------------------------WHICH ONE OF THEM?-------------------------
*
* errors: {
*   field: default message,
* },
* internalCode: M1-001
* */