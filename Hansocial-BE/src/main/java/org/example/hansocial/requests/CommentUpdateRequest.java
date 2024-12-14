package org.example.hansocial.requests;

import lombok.Data;


public class CommentUpdateRequest {

	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
