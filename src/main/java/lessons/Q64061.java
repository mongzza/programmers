package lessons;

import java.util.Stack;

// 19 카카오 개발자 겨울 인턴십 - 크레인 인형뽑기 게임 ㅇ
public class Q64061 {
    public static void main(String[] args) {
        int[][] board = {   {0,0,0,0,0},
                            {0,0,1,0,3},
                            {0,2,5,0,1},
                            {4,2,4,4,2},
                            {3,5,1,3,1}
                        };
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println("answer : " + solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int count = 0;

        Stack<Integer> basket = new Stack<>();
        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                int pick = board[j][moves[i]-1];
                if(pick == 0) {
                    continue;
                } else {
                    if(basket.size() != 0 && pick == basket.peek()) {
                        basket.pop();
                        count += 2;
                    } else {
                        basket.push(pick);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }

        }
        return count;
    }
}
