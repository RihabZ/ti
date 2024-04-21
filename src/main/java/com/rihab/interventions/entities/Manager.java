package com.rihab.interventions.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Manager {
	
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private long codeManager;
	 @Column(name = "PERS_CIVILITE  ",nullable = false, columnDefinition = "VARCHAR(4) DEFAULT 'Mr'")
	 	private String civilite;
	 

@OneToOne
private User user;



}
