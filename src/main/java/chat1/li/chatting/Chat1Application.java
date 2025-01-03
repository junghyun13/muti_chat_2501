package chat1.li.chatting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA Audititng 활성화
@SpringBootApplication
public class Chat1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chat1Application.class, args);
	}

}
