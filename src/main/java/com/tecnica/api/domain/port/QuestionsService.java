package com.tecnica.api.domain.port;

import com.tecnica.api.adapters.questions.dto.QuestionsRequestDto;
import com.tecnica.api.domain.model.questions;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public interface QuestionsService {

    @Autowired
    private QuestionsRepository qRepository;

    @Transactional
    public void createQuestion(QuestionsRequestDto question) {
        qRepository.save(question);
    }


}
