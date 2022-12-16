package 단어_변환;

import java.util.*;

class Solution {

    void num( String now , int cnt, String[] words ,Set<String> set){
        if (now.equals(T)){
            answer = Math.min(answer,cnt);
            return;
        }
        for (int i =0; i<words.length; i++){
            if (set.contains(words[i])==true)
                continue;
            int seq= 0;
            // System.out.println(now+"   " +words[i]);
            for (int j =0; j<words[i].length();j++){
                if (words[i].charAt(j)!= now.charAt(j)){
                    seq+=1;
                }

            }
            if (seq ==1){
                set.add(words[i]);
                num(words[i],cnt+1,words,set);
                set.remove(words[i]);
            }

        }
        return ;
    }
    static int answer =500;
    static String T;
    public int solution(String begin, String target, String[] words) {
        T= target;
        Set <String> set = new HashSet<>();
        set.add(begin);
        // System.out.println(set);
        num(begin, 0, words,set);
        if (answer==500)
            return 0;
        return answer;
    }
}