package org.example.hansocial.requests;

import lombok.Data;


public class PostUpdateRequest {

	String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	String text;
}
