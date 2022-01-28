package me.alxndr.chapter1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Alexander Choi
 * @date : 2022/01/28
 */
public class Problem4 {

    public ArrayList<String> solution(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            char[] chars = s.toCharArray();

            int lt = 0;
            int rt = chars.length - 1;

            while (lt < rt) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;

                lt++;
                rt--;
            }
            answer.add(String.valueOf(chars));
        }

        return answer;
    }


    public static void main(String[] args) {

        Problem4 problem4 = new Problem4();

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] str = new String[length];

        for (int  i = 0; i < length; i++) {
            str[i] = sc.next();
        }

        ArrayList<String> answers = problem4.solution(length, str);
        for (String s : answers) {
            System.out.println(s);
        }
    }

}
