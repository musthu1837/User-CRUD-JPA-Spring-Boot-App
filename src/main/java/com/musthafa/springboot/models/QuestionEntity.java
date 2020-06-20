package com.musthafa.springboot.models;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuestionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String question;
	private String[] answers;
	private int correctIndex;
	private int marks;
	private boolean marked;
	
	public QuestionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuestionEntity(int id, String question, String[] answers, int correctIndex, int marks, boolean marked) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
		this.correctIndex = correctIndex;
		this.marks = marks;
		this.marked = marked;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getAnswers() {
		return answers;
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	public int getCorrectIndex() {
		return correctIndex;
	}
	public void setCorrectIndex(int correctIndex) {
		this.correctIndex = correctIndex;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public boolean isMarked() {
		return marked;
	}
	public void setMarked(boolean marked) {
		this.marked = marked;
	}
	@Override
	public String toString() {
		return "QuestionsEntity [id=" + id + ", question=" + question + ", answers=" + Arrays.toString(answers)
				+ ", correctIndex=" + correctIndex + ", marks=" + marks + ", marked=" + marked + "]";
	}
	
	
}
