package edu.eci.arep.collatz;

import java.util.ArrayList;

public class Collatz {

    public Collatz(){

    }

    private ArrayList<Integer> lista = new ArrayList<>();
    private String answer;

    public String analisis(int num){
        answer = String.valueOf(num);
        while (num != 1){
            if(num % 2 == 0){
                answer = answer.concat("->");
                num = num/2;
                answer = answer.concat(String.valueOf(num));
            }else{
                answer = answer.concat("->");
                num = (3*num) + 1;
                answer = answer.concat(String.valueOf(num));
            }
        }
        return answer;
    }
}
