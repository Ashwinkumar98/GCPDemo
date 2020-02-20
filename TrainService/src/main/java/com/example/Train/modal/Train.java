package com.example.Train.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	private Integer availability;
	
}
