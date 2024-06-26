package com.rihab.interventions.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data 
@NoArgsConstructor 
@AllArgsConstructor
@Entity
public class Demandeur {

	  
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private long codeDemandeur;

	    private String post;
	    
	

@ManyToOne
private Client client;

@OneToOne
private User user;

@JsonIgnore
@OneToMany(mappedBy = "demandeur")
private List<Ticket> tickets;

	   
}
