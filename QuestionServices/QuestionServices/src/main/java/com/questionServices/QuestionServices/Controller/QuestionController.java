package com.questionServices.QuestionServices.Controller;

import com.questionServices.QuestionServices.Entities.Question;
import com.questionServices.QuestionServices.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService quesService;


    @PostMapping
    public Question create(@RequestBody Question question){
        return quesService.create(question);
 }

 @GetMapping
    public List<Question> getAll(){
        return quesService.get();
 }

 @GetMapping("/{questionId}")
    public Question getAll(@PathVariable Long questionId){
        return quesService.getOne(questionId);
 }
// get all Question of specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
            return quesService.getQuestionsOfQuiz(quizId);
    }


}
