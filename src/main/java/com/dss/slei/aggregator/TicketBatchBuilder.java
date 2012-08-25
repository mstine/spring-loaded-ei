package com.dss.slei.aggregator;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dss.slei.service.Ticket;
import com.dss.slei.service.TicketBatch;

@Component
public class TicketBatchBuilder {
	
	public TicketBatch createFrom(List<Ticket> tickets) {
		TicketBatch ticketBatch = new TicketBatch();
		
		for (Ticket ticket : tickets) {
			if (ticket.getId() != null) {
				ticketBatch.addTicket(ticket);
			}
		}
		
		return ticketBatch;
	}

}
