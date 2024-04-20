package com.rihab.interventions.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihab.interventions.entities.*;
import com.rihab.interventions.repos.*;

@Service
public class EquipementServiceImpl implements EquipementService {
	
				@Autowired
				EquipementRepository equipementRepository;
	
	
	
	@Override
	public Equipement saveEquipement(Equipement eqpt)
	{
		return equipementRepository.save(eqpt);
		
	}
	
	@Override
	public Equipement updateEquipement(Equipement eqpt) {
			return equipementRepository.save(eqpt);
	}
	
	
	@Override
	public void deleteEquipement(Equipement eqpt) {
		equipementRepository.delete(eqpt);
	}
	
	
	 @Override
	public void deleteEquipementByCode(String code) {
		 equipementRepository.deleteById(code);
	}
	 
	 
	@Override
	public Equipement getEquipement(String code) {
			return equipementRepository.findById(code).get();
	}
	
	
	@Override
	public List<Equipement> getAllEquipements() {
			return equipementRepository.findAll();
	}


	
	@Override
	public List<Equipement> findByEqptDesignation(String desing)
	{
		return equipementRepository.findByEqptDesignation(desing);
	}
	@Override
	public List<Equipement> findByEqptDesignationContains(String desing)
	{
		return equipementRepository.findByEqptDesignationContains(desing);
	}

	@Override
	public List<Equipement> findByDesingPrix ( String desing,Double prix)
	{
		return equipementRepository.findByDesingPrix(desing,prix);
	}


	
	@Override
	public List<Equipement> findByTypeEqtyCode(String eqtyCode)
	{
		return equipementRepository.findByTypeEqtyCode( eqtyCode);
				
	}

	

	
	
	
	
	
	
	
	
}
