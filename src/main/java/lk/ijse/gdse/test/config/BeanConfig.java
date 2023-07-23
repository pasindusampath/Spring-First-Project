package lk.ijse.gdse.test.config;

import lk.ijse.gdse.test.dto.Processor;
import lk.ijse.gdse.test.dto.impl.ProcessorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("lk.ijse.gdse.test.dto")
@PropertySource("application.properties")
public class BeanConfig {
    @Bean
    public Processor getProcessorImpl(){
        return new ProcessorImpl();
    }
}
