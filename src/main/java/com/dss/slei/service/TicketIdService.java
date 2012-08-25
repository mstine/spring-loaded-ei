package com.dss.slei.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

@Component
public class TicketIdService {
	
	private AtomicInteger idSequence = new AtomicInteger(1);
	
	public Ticket assignIdTo(Ticket ticket) {
		ticket.setId(idSequence.getAndIncrement());
		return ticket;
	}

}
