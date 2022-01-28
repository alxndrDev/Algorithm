package me.alxndr.chapter1;

import java.util.Locale;

/**
 * @author : Alexander Choi
 * @date : 2022/01/28
 */
public class FindString {

    public int solution(String str, char t) {

        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char c : str.toCharArray()) {
            if (c == t) {
                answer ++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        FindString findString = new FindString();
        int answer = findString.solution("Computercoller", 'c');
        System.out.println(answer);
    }

}
