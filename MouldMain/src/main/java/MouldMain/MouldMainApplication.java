package MouldMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启 Eureka 服务
@EnableEurekaServer
public class MouldMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MouldMainApplication.class, args);
	}

}
