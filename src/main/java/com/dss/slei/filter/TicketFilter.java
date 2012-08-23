package com.dss.slei.filter;

import org.springframework.stereotype.Component;

import com.dss.slei.service.Ticket;

@Component
public class TicketFilter {
	
	public boolean isNotFromMilton(Ticket ticket) {
		return !ticket.getSubmitter().equals("Milton");
	}

}
