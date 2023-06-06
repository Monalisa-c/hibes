package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ques")
public class Questionn {

	@Id
	private int qid;
	private String question;
	
	@OneToOne
	@JoinColumn(name = "an_id")
	Answerr ans;
	
	
	public Answerr getAns() {
		return ans;
	}
	public void setAns(Answerr ans) {
		this.ans = ans;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
	
}
