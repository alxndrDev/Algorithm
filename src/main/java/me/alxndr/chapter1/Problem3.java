package me.alxndr.chapter1;

import java.util.Scanner;

/**
 * @author : Alexander Choi
 * @date : 2022/01/28
 */
public class Problem3 {


    public String solution(String str) {

        String answer = "";

        String[] splitedStr = str.split(" ");

        for (String s : splitedStr) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Problem3 problem3 = new Problem3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String solution = problem3.solution(str);

        System.out.println(solution);
    }
}
