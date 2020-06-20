package com.musthafa.springboot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String fullName;
	private String emailId;
	private int score;
	private int rightAnswered;
	private int wrongAnswered;
	private int notAnswereds;
	
	public UserEntity() {
		super();
	}
	public UserEntity(int id, String fullName, String emailId, int score, int rightAnswered, int wrongAnswered,
			int notAnswereds) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.emailId = emailId;
		this.score = score;
		this.rightAnswered = rightAnswered;
		this.wrongAnswered = wrongAnswered;
		this.notAnswereds = notAnswereds;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRightAnswered() {
		return rightAnswered;
	}
	public void setRightAnswered(int rightAnswered) {
		this.rightAnswered = rightAnswered;
	}
	public int getWrongAnswered() {
		return wrongAnswered;
	}
	public void setWrongAnswered(int wrongAnswered) {
		this.wrongAnswered = wrongAnswered;
	}
	public int getNotAnswereds() {
		return notAnswereds;
	}
	public void setNotAnswereds(int notAnswereds) {
		this.notAnswereds = notAnswereds;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", fullName=" + fullName + ", emailId=" + emailId + ", score=" + score
				+ ", rightAnswered=" + rightAnswered + ", wrongAnswered=" + wrongAnswered + ", notAnswereds="
				+ notAnswereds + "]";
	}

	
}
