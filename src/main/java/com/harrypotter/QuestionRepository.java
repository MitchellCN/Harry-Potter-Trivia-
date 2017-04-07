package com.harrypotter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

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
                "SELECT * FROM question ORDER BY question_id",
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
