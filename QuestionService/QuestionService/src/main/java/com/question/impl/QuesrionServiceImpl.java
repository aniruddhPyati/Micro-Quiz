package com.question.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repositories.QuestionRepo;
import com.question.services.QuestionService;

@Service
public class QuesrionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepo questionRepo;

	public QuesrionServiceImpl(QuestionRepo questionRepo) {
		this.questionRepo = questionRepo;
	}

	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepo.save(question);
	}

	@Override
	public Question getOne(Long id) {
		// TODO Auto-generated method stub
		return questionRepo.findById(id).orElseThrow(()-> new RuntimeException("Not found question"));
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionRepo.findAll();
	}

	@Override
	public List<Question> getQuestionOfQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepo.findByQuizId(quizId);
	}
	
}
