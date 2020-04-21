package lessons;

import java.util.Stack;

// 쇠막대기 x
public class Q42585 {
    public static void main(String[] args) {
        String arrangement = "()(((()())(())()))(())";
        System.out.println("answer : " + solution(arrangement));
    }
    public static int solution(String arrangement) {
        int slice = 0; // 잘린 조각 수
        int lasers = 0; // 누적 레이저 수
        int laser = 0; // 현재 막대에서 추가된 레이저
        boolean isStick = false;
        Stack<Character> brakets = new Stack<>();
        for(int i=0; i<arrangement.length(); i++) {
            if(brakets.size() == 0) {
                lasers = 0;
                laser = 0;
            }
            char braket = arrangement.charAt(i);
            if(braket == '(') {
                if(arrangement.charAt(i+1) == ')') {
                    laser++;
                } else {
                    brakets.push(braket);
                    isStick = true;
                }
            }
            else {
                if(arrangement.charAt(i-1) != '(') {
                    if(isStick) {
                        slice += laser + 1;
                    } else {
                        slice += lasers + laser + 1;
                    }

                    lasers += laser;
                    laser = 0;
                    brakets.pop();
                    isStick = false;
                }
            }
        }

        return slice;
    }
}
