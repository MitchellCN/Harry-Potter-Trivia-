package com.harrypotter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by cmitchell on 4/8/17.
 */
public class Answer {
    private Random random;
    private String answer;
    private String answer1;
    private String answer2;
    private String answer3;

    public Answer(String answer, String answer1, String answer2, String answer3) {
        this.answer = answer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public List<String> a(){
        List<String> x = Arrays.asList(answer,answer1,answer2,answer3);
        return x;
    }

    public ArrayList<String> randomOrder(){
        List<String> x = a();
        ArrayList<String> order = new ArrayList<>();
        for (int i = 0; i < x.size();i++){
            order.add(x.get(random.nextInt(x.size())));
        }
           return order;

    }




}
