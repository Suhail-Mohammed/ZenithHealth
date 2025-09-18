package ris.project.ZenithHealth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ris.project.ZenithHealth.entity.TestEntity;
import ris.project.ZenithHealth.repository.TestRepository;


@SpringBootApplication
public class ZenithHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZenithHealthApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(TestRepository repo) {
		return args -> {
			repo.save(new TestEntity("Hello MySQL!"));
			System.out.println("✅ Data saved to MySQL!");
		};
	}

}
