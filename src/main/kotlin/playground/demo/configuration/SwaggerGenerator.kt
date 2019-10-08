package playground.demo.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@Configuration
class SwaggerGenerator {

    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("playground.demo"))
                .paths(PathSelectors.any())
                .build()
    }

    @Bean
    fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
                .title("Kotlin Playground")
                .description("Kotlin playground API")
                .version("0.0.1")
                .build()
    }
}