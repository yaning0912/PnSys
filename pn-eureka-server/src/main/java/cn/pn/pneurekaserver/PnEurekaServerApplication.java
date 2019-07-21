package cn.pn.pneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PnEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PnEurekaServerApplication.class, args);
    }

}
