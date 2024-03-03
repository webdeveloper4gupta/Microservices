package com.quizServices.QuizServices.respositories;

import com.quizServices.QuizServices.entites.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface QuizRepository extends JpaRepository<Quiz,Long> {

}
