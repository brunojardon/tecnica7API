package com.tecnica.api.adapters.questions.dto;

import lombok.Data;

@Data
public class QuestionsRequestDto {
    private Long idQuestion;
    private String question;
    private String answer;
}
