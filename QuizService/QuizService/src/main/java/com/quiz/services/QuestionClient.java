package com.quiz.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entities.Question;

@FeignClient(name="QUESTION-SERVICE")
//@FeignClient(url="http://localhost:8088", value="Question-Client")
public interface QuestionClient {

	@GetMapping("/question/quiz/{quizId}")
	List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);
	
}
