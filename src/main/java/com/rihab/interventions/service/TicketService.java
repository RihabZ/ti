package com.rihab.interventions.service;


import java.util.List;
import java.util.UUID;

import com.rihab.interventions.entities.Ticket;

public interface TicketService {
	
	
	Ticket saveTicket(Ticket inter) ;
	Ticket updateTicket(Ticket inter);
void deleteTicket(Ticket inter);
 void deleteTicketByCode(UUID code);
 Ticket getTicket(UUID code);
List<Ticket> getAllTickets();

List<Ticket> findByInterDesignation(String desing);
List<Ticket> findByInterDesignationContains(String desing); 


List<Ticket> findByEquipementEqptCode(String eqptCode);
List<Ticket>findByInterventionNatureCode(String code);


}