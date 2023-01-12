package com.example.namanmu;

//import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableEncryptableProperties
@EnableJpaAuditing
@SpringBootApplication
public class Application {

//	springapplication.run()가 was실행
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
