package com.example.BookTicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.BookTicket")
public class BookTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookTicketApplication.class, args);
	}

}
