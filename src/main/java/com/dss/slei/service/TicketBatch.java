package com.dss.slei.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketBatch {
	
	private List<Ticket> tickets = new ArrayList<Ticket>();
	
	public List<Ticket> getTickets() {
		return Collections.unmodifiableList(tickets);
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

}
