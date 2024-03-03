package com.quizServices.QuizServices.services;

import com.quizServices.QuizServices.entites.Quiz;

import java.util.List;

public interface QuizService {


    Quiz add(Quiz quiz);


    List<Quiz> get();
    Quiz get(Long id);

}
