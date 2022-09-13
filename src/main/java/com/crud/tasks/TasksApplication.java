package com.crud.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class TasksApplication extends SpringBootServletInitializer {


public class TaskApplication {
	public static void main(String[] args) {

		SpringApplication.run(TaskApplication.class, args);
	}

	//@Override
	//protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		//return application.sources(TasksApplication.class);
	//}

}

// 1. Postman,
// 2. Metoda Delete w zadaniu - aplikacja,
// 3. Tomcat,
// 4. Widok w aplikacji, nie wyświetla się jedna część,
// 5. Nie mogę wysłać kodu na githuba,
// 6. Nie działa mi strona aplikacji.