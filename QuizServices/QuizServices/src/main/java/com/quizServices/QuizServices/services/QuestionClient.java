package com.quizServices.QuizServices.services;

import com.quizServices.QuizServices.entites.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url="http://localhost:8082" ,value ="Question-Client")
//to implement the concept of the loadBalancer
//This interface is basically used for calling the QuizService api's using QuestionService
@FeignClient(name="QUESTION-SERVICE" )
public interface QuestionClient {
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);
}
