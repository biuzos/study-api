package com.github.biuzos.study_api;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApiApplication implements CommandLineRunner {
	
	private static Logger LOG = (Logger) LoggerFactory.getLogger(StudyApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StudyApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Implementando run");
		LOG.info("Estou tentando o log");
	}

}
