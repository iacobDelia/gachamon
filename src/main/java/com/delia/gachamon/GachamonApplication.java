package com.delia.gachamon;

import com.delia.gachamon.config.customProp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(customProp.class)
@SpringBootApplication
public class GachamonApplication {

	public static void main(String[] args) {
		SpringApplication.run(GachamonApplication.class, args);
	}

}
