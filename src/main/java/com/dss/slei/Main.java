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
				
		ticketService.submitJsonTicket(ticketJsonBuilder.toString());
		
		ticketJsonBuilder = new StringBuilder();
		ticketJsonBuilder.append("{ ")
			.append("\"title\": \"Missing Stapler\",")
			.append("\"description\": \"I seem to have misplaced my red Swingline stapler!\",")
			.append("\"submitter\": \"Milton\"")
			.append("}");			
				
		Ticket nullTicket = ticketService.submitJsonTicket(ticketJsonBuilder.toString());
		if (nullTicket == null) {
			log.info("Received a null response for Milton's ticket!");
		}
		
		ticketJsonBuilder = new StringBuilder();
		ticketJsonBuilder.append("{ ")
			.append("\"title\": \"New Purchase Order for A/P\",")
			.append("\"description\": \"We need to pay for a new desk for Bob Slidell.\",")
			.append("\"submitter\": \"Bill Lumbergh\"")
			.append("}");			
				
		ticketService.submitJsonTicket(ticketJsonBuilder.toString());
		
		ticketJsonBuilder = new StringBuilder();
		ticketJsonBuilder.append("{ ")
			.append("\"title\": \"TPS Report for Module 8675309\",")
			.append("\"description\": \"I didn't forget the cover sheet this time!\",")
			.append("\"submitter\": \"Peter Gibbons\"")
			.append("}");			
				
		ticketService.submitJsonTicket(ticketJsonBuilder.toString());
		
		ticketJsonBuilder = new StringBuilder();
		ticketJsonBuilder.append("{ ")
			.append("\"title\": \"PC LOAD LETTER\",")
			.append("\"description\": \"The fax machine is broken again!\",")
			.append("\"submitter\": \"Samir Nagheenanajar\"")
			.append("}");			
				
		ticketService.submitJsonTicket(ticketJsonBuilder.toString());		
	}

}
