package com.tecnica.api.domain.port;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tecnica.api.domain.model.questions;
public interface QuestionsRepository extends JpaRepository<questions, Long> {

}