package cn.com.bluemoon.moonorderjdeurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MoonorderJdEurekaServerApplication {
	private Logger logger= LoggerFactory.getLogger(MoonorderJdEurekaServerApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(MoonorderJdEurekaServerApplication.class, args);
	}

}

