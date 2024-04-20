package com.rihab.interventions.dto;

import com.rihab.interventions.entities.Role;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
	
	public class UserDTO {
	@Column(name = "user_id") // Spécifie le nom de la colonne d'identifiant
	private Long id;
	    private String nom;
	    private String prenom;
	    private String email;
	    private String tel;
	    private String age;
	    private Role role;
	}

