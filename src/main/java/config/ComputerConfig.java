package config;

import com.Okan.monitorfactory.SonyMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {
    @Bean
    public SonyMonitor monitor(){
        return new SonyMonitor("25 inch","acer",25);


    }


}
