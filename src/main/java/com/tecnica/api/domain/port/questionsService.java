package com.tecnica.api.domain.port;

import com.tecnica.api.domain.model.questions;
import java.util.List;

public interface questionsService {
    void save(questions question);
	List<questions> getPersonList();

}
