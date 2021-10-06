package za.ac.nwu.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.web.controller",
        "za.ac.nwu.web.exception"
})
public class WebConfig {

}
