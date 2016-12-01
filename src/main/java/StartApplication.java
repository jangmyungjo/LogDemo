import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jmj on 2016-11-16.
 */
@Controller
@EnableAutoConfiguration
public class StartApplication {

    static Logger logger = LoggerFactory.getLogger(StartApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartApplication.class, args);

        while (true){
            logger.info("this is test log");
            Thread.sleep(5000);
        }
    }

    @RequestMapping("/errorEvent")
    void home() {

        throw new RuntimeException();
    }
}
