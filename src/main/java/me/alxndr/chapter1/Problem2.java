package me.alxndr.chapter1;

import java.util.Scanner;

/**
 * @author : Alexander Choi
 * @date : 2022/01/28
 */
public class Problem2 {

    public String solution(String str) {

        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Problem2 problem2 = new Problem2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String solution = problem2.solution(str);

        System.out.println(solution);
    }

}
