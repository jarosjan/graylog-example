package playground.demo.controller

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/test")
class TestController {


    private val LOGGER : Logger = LogManager.getLogger(TestController::class.java)

    @GetMapping
    fun getTest() : String {
        LOGGER.info("get mapping")
        LOGGER.warn("warn")
        LOGGER.error("error")
        LOGGER.debug("debug")
        return "Hello Kotlin programmer"
    }
}