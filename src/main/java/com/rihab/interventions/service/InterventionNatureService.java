package com.rihab.interventions.service;

import java.util.List;

import com.rihab.interventions.entities.InterventionNature;

public interface InterventionNatureService {

	InterventionNature saveInterventionNature(InterventionNature nature);
	InterventionNature updateInterventionNature(InterventionNature nature);
void deleteInterventionNature(InterventionNature nature);
 void deleteInterventionNatureByCode(String code);
 InterventionNature getInterventionNature(String code);
List<InterventionNature> getAllInterventionsNature();


List<InterventionNature> findByLibelle(String libelle);
List<InterventionNature> findByLibelleContains(String Libelle); 

}
