package com.dss.slei.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;

public class TicketBatch {

	private List<Ticket> tickets = new ArrayList<Ticket>();

	public List<Ticket> getTickets() {
		return Collections.unmodifiableList(tickets);
	}

	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	@Override
	public String toString() {
		ToStringHelper helper = Objects.toStringHelper(this);

		for (Ticket ticket : tickets) {
			helper.add("Ticket ID", ticket.getId());
		}

		return helper.toString();
	}

}
