package com.harrypotter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.net.ConnectException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.List;

/**
 * Created by cmitchell on 4/6/17.
 */


@Component
public class QuestionRepository {

    @Autowired
    JdbcTemplate template;

    public List<Question> listQuestion() {

        return template.query(
                "SELECT question_id, question,answer,answer1,answer2,answer3 FROM trivia_game order BY Random() limit 1",
                (rs, i) -> new Question(
                        rs.getInt("question_id"),
                        rs.getString("question"),
                        rs.getString("answer"),
                        rs.getString("answer1"),
                        rs.getString("answer2"),
                        rs.getString("answer3")
                ));

    }



}
    //public boolean getAnswer(String question,int answerId){
       // select questionId from questions where answerId=answerId;
        //ResultSet rs;
       //return  ((rs,i)-> rs.isBeforeFirst());

//}
