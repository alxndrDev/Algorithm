package me.alxndr.chapter1;

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
        int answer = findString.solution("Computercoller", 'c');
        System.out.println(answer);
    }

}
