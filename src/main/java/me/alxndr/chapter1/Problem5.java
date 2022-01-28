package me.alxndr.chapter1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Alexander Choi
 * @date : 2022/01/28
 */
public class Problem5 {

    public String solution(String str) {

        String answer = "";

        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;

                lt++;
                rt--;
            }

            answer = String.valueOf(chars);
        }

        return answer;
    }

    public static void main(String[] args) {

        Problem5 problem5 = new Problem5();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = problem5.solution(str);
        System.out.println(answer);
    }


}
