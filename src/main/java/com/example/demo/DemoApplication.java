package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner asd() {
		return args -> {
			Asd asd = createMe("first");
			String asd2 = asd.value("last");
			System.out.println(asd.value("last"));
			System.out.println(asd.value("last"));
			System.out.println(asd.value("last"));
		};
	}

	private Asd createMe(String text) {
		AtomicInteger number = new AtomicInteger(13);
		return new Asd() {

			@Override
			public String value(String data) {
				number.incrementAndGet();
				return data + " " + text + " = " + number;
			}
		};
	}
}

interface Asd {
	String value(String data);
}