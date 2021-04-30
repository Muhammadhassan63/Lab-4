/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_assignment2_runner;

import java.util.StringTokenizer;
public class CustomStringTokenizer extends StringTokenizer {
        private int Count;

    public CustomStringTokenizer(String s)  {
        super(s);
    }

    @Override
    public int countTokens(){
        int total_Tokens = super.countTokens();
        Count = total_Tokens;
        String initial_token;
        for(int i=0;i<total_Tokens;i++){
            initial_token = super.nextToken();
            for(int j = 0; j<initial_token.length(); j++){
                if(Character.isDigit(initial_token.charAt(j))){
                    Count--;
                    break;
                }
            }
        }
        return Count;
    }
}