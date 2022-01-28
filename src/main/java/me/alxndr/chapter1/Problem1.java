package me.alxndr.chapter1;

import java.util.Scanner;

/**
 * @author : Alexander Choi
 * @date : 2022/01/28
 */
public class Problem1 {

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
        Problem1 findString = new Problem1();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        int answer = findString.solution(str, c);

        System.out.println(answer);
    }

}
