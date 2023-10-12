package com.tecnica.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class questionEntity {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String question;
	private String answer;

    public questionEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getquestion() {
		return question;
	}

	public void setquestion(String question) {
		this.question = question;
	}

	public String getanswer() {
		return answer;
	}

	public void setanswer(String answer) {
		this.answer = answer;
	}
}
