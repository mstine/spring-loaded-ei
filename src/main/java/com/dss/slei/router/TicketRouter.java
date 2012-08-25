package com.dss.slei.router;

import org.springframework.stereotype.Component;

import com.dss.slei.service.Ticket;

@Component
public class TicketRouter {
	
	public String staffMemberFor(Ticket ticket) {
		String staffMember = null;
		
		if (ticket.subjectIs("A/P")) {
			staffMember = "NINA";
		} else if (ticket.subjectIs("TPS REPORT")) {
			staffMember = "B_LUMBERGH";
		} else if (ticket.subjectIs("PC LOAD LETTER")) {
			staffMember = "M_BOLTON";
		} else if (ticket.subjectIs("BUG")) {
			staffMember = "P_GIBBONS";
		}
		
		return staffMember;
	}

}
