package com.example.BookTicket.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookTicket.modal.Booking;
import com.example.BookTicket.service.TicketBookingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TicketBookingController {
	
	private final TicketBookingService service;
	
	@PostMapping("/BookTicket/trainno/{trainno}")
	public ResponseEntity<String> BookTicket(@RequestBody Booking book,@PathVariable("trainno") Integer trainno){
		return new ResponseEntity<String>(service.BookTicket(book, trainno), HttpStatus.OK);
	}
}
