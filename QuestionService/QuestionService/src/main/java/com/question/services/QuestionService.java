package com.question.services;

import java.util.List;

import com.question.entities.Question;

public interface QuestionService {

	Question create(Question question);
	
	Question getOne(Long id);
	
	List<Question> get();
	
	List<Question> getQuestionOfQuiz(Long quizId);
	
}
