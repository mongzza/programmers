package programmers;

public class Task1 {
    public static void main(String[] args) {
        String p = "00000000000000000000"; // 현재 눈금선에 있는 숫자
        String s = "91919191919191919191"; // 비밀번호 (비밀번호의 길이 : 1000 자리 이하의 자연수)

        System.out.println("answer : " + solution(p, s)); // 자물쇠를 풀기 위한 최소 횟수
    }

    public static int solution(String p, String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            int curP = Integer.parseInt(String.valueOf(p.charAt(i)));
            int curS = Integer.parseInt(String.valueOf(s.charAt(i)));

            if(Math.abs(curP - curS) <= 5) {
                answer += Math.abs(curP - curS);
            } else {
                answer += Math.min(curP, curS) - Math.max(curP, curS) + 10;
            }

        }

        return answer;
    }
}
