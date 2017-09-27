import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@PropertySource("app.properties")
@ComponentScan({"com.pluralsight"})
@Configuration
public class AppConfig {

//    ???? I don't need this
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

//    @Bean//(name = "customerService")
//    public CustomerService getCustomerService() {
//        return new CustomerServiceImpl();
//    }
}
