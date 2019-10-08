package playground.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@SpringBootApplication
class DemoApplication

var LOGGER : Logger = LogManager.getLogger(DemoApplication::class.java)

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
	LOGGER.info("Application started...");
}
