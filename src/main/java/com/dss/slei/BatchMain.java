package com.dss.slei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dss.slei.service.Ticket;
import com.dss.slei.service.TicketBatch;
import com.dss.slei.service.TicketBatchService;

public class BatchMain {
		
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/integration/ticketFlow.xml");
		TicketBatchService ticketBatchService = context.getBean("ticketBatchService", TicketBatchService.class);
		
		TicketBatch batch = new TicketBatch();
		
		Ticket ticket = new Ticket();
		ticket.setTitle("We've got a bug!");
		ticket.setDescription("When I tried to submit a new ticket, I got a huge stack trace!");
		ticket.setSubmitter("Matt Stine");
		batch.addTicket(ticket);
		
		ticket = new Ticket();
		ticket.setTitle("Missing Stapler");
		ticket.setDescription("I seem to have misplaced my red Swingline stapler!");
		ticket.setSubmitter("Milton");
		batch.addTicket(ticket);
		
		ticket = new Ticket();
		ticket.setTitle("New Purchase Order for A/P");
		ticket.setDescription("We need to pay for a new desk for Bob Slidell.");
		ticket.setSubmitter("Bill Lumbergh");
		batch.addTicket(ticket);
		
		ticket = new Ticket();
		ticket.setTitle("TPS Report for Module 8675309");
		ticket.setDescription("I didn't forget the cover sheet this time!");
		ticket.setSubmitter("Peter Gibbons");
		batch.addTicket(ticket);
		
		ticket = new Ticket();
		ticket.setTitle("PC LOAD LETTER");
		ticket.setDescription("The fax machine is broken again!");
		ticket.setSubmitter("Samir Nagheenanajar");
		batch.addTicket(ticket);
		
		ticketBatchService.submit(batch);	
	}


}
