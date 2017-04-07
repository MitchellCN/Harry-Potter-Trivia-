package com.harrypotter;

import java.sql.ResultSet;

/**
 * Created by cmitchell on 4/6/17.
 */
public class QuestionRepository {


    public boolean getAnswer(String question,int answerId){
        select questionId from questions where answerId=answerId;
        ResultSet rs;
       return  ((rs,i)-> rs.isBeforeFirst());
    }
}
