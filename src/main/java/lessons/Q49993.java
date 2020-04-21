package lessons;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Summer/Winter Coding(~2018) - 스킬트리
public class Q49993 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skillTrees = {"BACDE", "CBADF", "AECB", "BD", "ACED"};
                            //  x          o       o       x     x

        System.out.println("answer : " + solution(skill, skillTrees));
    }

    public static int solution(String skill, String[] skillTrees) {
        int answer = 0;

        // 맨 첫번째 값이랑 다르고, 해당 값을 가지고 있다면 => 실패
        Queue<Character> skillQ = new LinkedList<>();
        for(int j=0; j<skill.length(); j++) {
            skillQ.add(skill.charAt(j));
        }
        for(int i=0; i<skillTrees.length; i++) {
            for(int j=0; j<skillTrees[i].length(); j++) {
                if(skillQ.peek() != skillTrees[i].charAt(j) && skillTrees[i].contains(skillQ.peek().toString())) {
                    break;
                } else {
                    
                }
            }

        }

        return answer;
    }
}
