package com.quizServices.QuizServices.Controller;


import com.quizServices.QuizServices.entites.Quiz;
import com.quizServices.QuizServices.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {


    @Autowired
    private QuizService quizService; // here I use the field injection concept


    @PostMapping
public Quiz create(@RequestBody Quiz quiz ){
            return quizService.add(quiz);
}
//getAll

    @GetMapping
    public List<Quiz> get(){
            return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
            return quizService.get(id);
    }


}
