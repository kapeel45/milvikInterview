package com.milvik.question;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.milvik.answer.Answer;
import com.milvik.model.util.Traceability;

@Entity
public class Question extends Traceability{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long questionId;
	
	private String question;

	private String questionType;
	
	@OneToMany(mappedBy = "question", cascade= CascadeType.ALL, orphanRemoval=true, fetch =FetchType.LAZY)
	List<Answer> lstAnswer = new ArrayList<>();

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getLstAnswer() {
		return lstAnswer;
	}

	public void setLstAnswer(List<Answer> lstAnswer) {
		this.lstAnswer = lstAnswer;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

}
