package org.example.hansocial.responses;

import org.example.hansocial.entities.Post;
import lombok.Data;

import java.util.Date;
import java.util.List;


public class PostResponse {
	
	Long id;
	Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	public List<LikeResponse> getPostLikes() {
		return postLikes;
	}

	public void setPostLikes(List<LikeResponse> postLikes) {
		this.postLikes = postLikes;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	String userName;
	String title;
	String text;
	List<LikeResponse> postLikes;
	Date createDate;
	
	public PostResponse(Post entity, List<LikeResponse> likes) {
		this.id = entity.getId();
		this.userId = entity.getUser().getId();
		this.userName = entity.getUser().getUserName();
		this.title = entity.getTitle();
		this.text = entity.getText();
		this.postLikes = likes;
		this.createDate = entity.getCreateDate();
	}
}
