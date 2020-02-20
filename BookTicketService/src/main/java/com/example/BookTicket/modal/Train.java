package com.example.BookTicket.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Train")
@Data
public class Train {
	
	@Id
	private Integer trainno;
	private String trainname;
	private String source;
	private String destination;
	private String traveltime;
	private Double fare;
	private Integer Availability;
	
}
