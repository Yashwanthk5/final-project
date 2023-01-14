package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Video {
	@Id@GeneratedValue
	private int videoId;
	private String title;
	private String description;
	private String link;
	private String year;
	private String link1;
	private String link2;
	private String link3;
	
	public Video() {
		
	}

	public Video(String title, String description, String link, String year, String link1, String link2, String link3) {
		super();
		this.title = title;
		this.description = description;
		this.link = link;
		this.year = year;
		this.link1 = link1;
		this.link2 = link2;
		this.link3 = link3;
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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getLink1() {
		return link1;
	}

	public void setLink1(String link1) {
		this.link1 = link1;
	}

	public String getLink2() {
		return link2;
	}

	public void setLink2(String link2) {
		this.link2 = link2;
	}

	public String getLink3() {
		return link3;
	}

	public void setLink3(String link3) {
		this.link3 = link3;
	}
	
	
	
}
