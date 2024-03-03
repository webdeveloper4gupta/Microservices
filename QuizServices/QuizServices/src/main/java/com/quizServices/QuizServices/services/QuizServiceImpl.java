package com.quizServices.QuizServices.services;

import com.quizServices.QuizServices.entites.Quiz;
import com.quizServices.QuizServices.respositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class QuizServiceImpl implements QuizService{ // to implement the concept of loading overloading method , click alt +enter , then select methods


    @Autowired
    private QuizRepository quizrepo;

    @Autowired
    private QuestionClient questionClient;

    @Override
    public Quiz add(Quiz quiz) {
        return  quizrepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List<Quiz> quizzes=quizrepo.findAll();
      List<Quiz> newQuizList= quizzes.stream().map(q->{
            q.setQuestions(questionClient.getQuestionsOfQuiz(q.getId()));
            return q;
        }).collect(Collectors.toList());
        return newQuizList;
    }

    @Override
    public Quiz get(Long id) {
        Quiz quiz =quizrepo.findById(id).orElseThrow(()->new RuntimeException("Sorry not found"));
        quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
        return  quiz;
    }


}
