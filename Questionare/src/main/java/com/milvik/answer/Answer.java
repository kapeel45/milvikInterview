package com.milvik.answer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.milvik.model.util.Traceability;
import com.milvik.question.Question;

@Entity
public class Answer extends Traceability{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long answerId;
	
	private String answer;
	
	@ManyToOne
	@JoinColumn(name= "question_id")
	private Question question;

	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
