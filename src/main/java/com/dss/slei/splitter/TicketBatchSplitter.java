package com.dss.slei.splitter;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dss.slei.service.Ticket;
import com.dss.slei.service.TicketBatch;

@Component
public class TicketBatchSplitter {
	
	public List<Ticket> ticketsFrom(TicketBatch ticketBatch) {
		return ticketBatch.getTickets();
	}

}
