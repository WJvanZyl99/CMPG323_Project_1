package za.ac.nwu.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.logic.config.LogicConfig;

@Import({LogicConfig.class})
@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.web.controller",
        "za.ac.nwu.web.exception"
})
public class WebConfig {

}
