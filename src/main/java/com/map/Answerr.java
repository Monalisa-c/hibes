package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ans")
public class Answerr {
	@Id
private int aid;
private String answer;

@OneToOne(mappedBy = "ans")
Questionn question;



public Questionn getQuestion() {
	return question;
}
public void setQuestion(Questionn question) {
	this.question = question;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}


}
