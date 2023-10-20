package com.tecnica.api.adapters.questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnica.api.adapters.questions.dto.QuestionsRequestDto;

import com.tecnica.api.domain.port.QuestionsService;

@RestController
@RequestMapping("/api/questions")
public class QuestionsController {

    @Autowired
    private QuestionsService qService;

    @PostMapping
    public String registerRequest(@RequestBody QuestionsRequestDto request) {
        qService.createQuestion(request);
        return "consulta creada";
    }

}
