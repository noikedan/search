package com.example.search.domains;

import java.util.Date;

public class Task {

	public Task(String title, Date lmt) {
		this.title = title;
		this.lmt = lmt;
	}

	public Task(int id) {
		this.id = id;
	}

	public Task(int id, Boolean status, String title, Date lmt) {
		this.id = 0;
		this.status = status;
		this.title = title;
		this.lmt = lmt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getLmt() {
		return lmt;
	}

	public void setLmt(Date lmt) {
		this.lmt = lmt;
	}

	private int id;
	private boolean status;
	private String title;
	private Date lmt;

}
