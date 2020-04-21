package programmers;

public class Task3 {
    public static void main(String[] args) {
        // numbers	                    k	result
        // [10, 40, 30, 20]	            20	    1
        // [3, 7, 2, 8, 6, 4, 5, 1]	    3	    2

        // Swap 연산을 이용해 원소들의 위치를 바꿔 서로 인접한 원소의 차가 K 이하가 되도록 하려 함
        int[] numbers = {10, 40, 30, 20}; // 길이(N)는 1 이상 8 이하, 원소는 1 이상 100 이하인 자연수이며 중복 없음
        int K = 20; // K는 1 이상 100 이하

        // swap 횟수의 최소값, 방법이 없다면 -1
        System.out.println("answers : " + solution(numbers, K));
    }

    public static int solution(int[] numbers, int K) {
        int answer = -1;

        return answer;
    }
}
