package com.example.namanmu;

//import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableEncryptableProperties
@EnableCaching
@EnableJpaAuditing
@SpringBootApplication
public class Application {

//	springapplication.run()가 was실행
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
//
//
///Application.java
//		/CacheKey.java
//		/RedisRepositoryConfig.java