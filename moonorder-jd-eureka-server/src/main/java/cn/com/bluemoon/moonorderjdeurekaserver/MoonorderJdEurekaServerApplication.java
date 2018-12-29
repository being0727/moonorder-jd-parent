package cn.com.bluemoon.moonorderjdeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MoonorderJdEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoonorderJdEurekaServerApplication.class, args);
	}

}

