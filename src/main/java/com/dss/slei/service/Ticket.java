package com.dss.slei.service;

import com.google.common.base.Objects;

public class Ticket {
	
	private Integer id;
	private String title;
	private String description;
	private String submitter;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("id", id)
				.add("title", title)
				.add("description", description)
				.add("submitter", submitter)
				.toString();
	}
	
	public boolean subjectIs(String subject) {
		return title.toUpperCase().indexOf(subject.toUpperCase()) != -1;
	}
}

