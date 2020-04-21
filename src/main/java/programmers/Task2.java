package programmers;

public class Task2 {
    // testcase 1개 실패
    public static void main(String[] args) {
        // 청소기 한 번 방문한 칸은 모든 먼지 청소(0)
        // 이동할 칸이 격자 밖이거나 물건 칸이면 다음 명령 수행
        // 로봇청소기 시작 방향은 항상 북쪽
        int[][] office = {  {5,-1,4},
                            {6,3,-1},
                            {2,-1,1}
                        }; // NxN 격자 사무실 먼지 배열, 물건 칸 : -1, 먼지 양 : 양수, 2<= N <= 20, 원소는 -1 또는 0 이상 100 이하
        int r = 1; // 로봇 청소기 y index
        int c = 0; // 로봇 청소기 x index
        String[] move = {"go", "go", "right", "go", "right", "go", "left", "go"}; // 로봇청소기 명령어 배열

        // 청소한 총 먼지의 양
        System.out.println("answer : " + solution(office, r, c, move));
    }

    public static int solution(int[][] office, int r, int c, String[] move) {
        int answer = 0;

        int direction = 4; // 4나누기 나머지가 0 : 북, 1 : 동, 2 : 남, 3 : 서
        answer += office[r][c];
        office[r][c] = 0;
        for(int i=0; i<move.length; i++) {
            System.out.println("현재위치 : ["+r+"]["+c+"]");
            System.out.println("현재위치 먼지 : " + office[r][c]);

            switch(move[i]) {
                case "go" :
                    if(direction == 0) direction += 4;

                    System.out.println("방향 : " + Math.abs(direction)%4);
                    switch(Math.abs(direction)%4) {
                        case 0 :
                            if(r-1 >= 0 && office[r-1][c] != -1) r--;
                            break;
                        case 1 :
                            if(c+1 <= office[0].length-1 && office[r][c+1] != -1) c++;
                            break;
                        case 2 :
                            if(r+1 <= office.length-1 && office[r+1][c] != -1) r++;
                            break;
                        case 3 :
                            if(c-1 >= 0 && office[r][c-1] != -1) c--;
                            break;
                        default : break;
                    }
                    answer += office[r][c];
                    office[r][c] = 0;
                    break;
                case "right" :
                    direction++;
                    break;
                case "left" :
                    direction--;
                    break;
                default: break;
            }

        }

        return answer;
    }
}
