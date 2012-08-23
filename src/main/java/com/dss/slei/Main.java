package com.dss.slei;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dss.slei.service.Ticket;
import com.dss.slei.service.TicketService;

public class Main {
	
	private static Logger log = Logger.getLogger(Main.class);
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/integration/ticketFlow.xml");
		TicketService ticketService = context.getBean("ticketService", TicketService.class);
		
		StringBuilder ticketJsonBuilder = new StringBuilder();
		ticketJsonBuilder.append("{ ")
			.append("\"title\": \"We've got a bug!\",")
			.append("\"description\": \"When I tried to submit a new ticket, I got a huge stack trace!\",")
			.append("\"submitter\": \"Matt Stine\"")
			.append("}");			
				
		Ticket ticket = ticketService.submitJsonTicket(ticketJsonBuilder.toString());
		
		log.debug("TICKET: " + ticket.toString());
	}

}
