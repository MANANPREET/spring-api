package org.upgrad.services;

import org.springframework.stereotype.Service;
import org.upgrad.models.Question;

import java.util.List;
import java.util.Set;

/*
    Author - Mananpreet Singh
    Date - 8 July, 2018
    Description - Interface that contains QuestionService methods
 */

@Service
public interface QuestionService {

    void addQuestion(String content, int user_id, Set<Integer> categoryId);
    Iterable<Question> getAllQuestionsByCategory(int categoryId);
    Iterable<Question> getAllQuestionsByUser(int user_id);
    void deleteQuestion(int id);
    Iterable<Integer> getQuestionId(int categoryId);
    int findUserIdfromQuestion(int questionId);
    Iterable<Question> getAllQuestions();
}
