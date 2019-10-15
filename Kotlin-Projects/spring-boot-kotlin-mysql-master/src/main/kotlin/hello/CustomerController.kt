package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class CustomerController @Autowired constructor(val repository:CustomerRepository) {

	@RequestMapping("/")
	fun findAll() = repository.findAll()

	@RequestMapping("/{lastName}")
	fun findByLastName(@PathVariable lastName:String)
			= repository.findByLastName(lastName)

	@RequestMapping(method = RequestMethod.GET)
	fun doSomething(@RequestHeader(name = "remote_addr") remoteAddress: String): ResponseEntity<Object> {
		logger.debug("The Remote address added by WebFiler is :: {}", remoteAddress)
		var response: ResponseEntity<Object>? = null
		try {
			response = ResponseEntity<Object>("SUCCESS", HttpStatus.OK)
		} catch (ex: Exception) {
			logger.error(ex.getMessage(), ex)
			return ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR)
		}

		return response
	}
}