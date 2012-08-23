package com.dss.slei.service;

import com.google.common.base.Objects;

public class Ticket {
	
	private String title;
	private String description;
	private String submitter;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSubmitter() {
		return submitter;
	}
	
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}
	
	public String toString() {
		return Objects.toStringHelper(this)
				.add("title", title)
				.add("description", description)
				.add("submitter", submitter)
				.toString();
	}
}

