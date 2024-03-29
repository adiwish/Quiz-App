package com.adiwish.quizapp.service;

import com.adiwish.quizapp.Question;
import com.adiwish.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
    public List<Question> getQuestionsByCategory(String category){
        return questionDao.findByCategory(category);
    }
    //random comment
    public String addQuestion(Question question){
        questionDao.save(question);
        return "success";
    }
}
