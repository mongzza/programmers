package lessons;

// 주식가격 ㅇ
public class Q42584 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3}; // 초 단위로 기록된 주식 가격 1 <= [] <= 10000, 2 <= length <= 100000
        solution(prices);
    }

    public static int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        for(int i=0; i<prices.length; i++) {
            int count = 0;
            int now = prices[i];
            for(int j=i+1; j<prices.length; j++) {
                count++;
                if(prices[j] >= now) {
                    continue;
                } else {
                    break;
                }
            }
            result[i] = count;
        }

        for (int i=0; i<result.length; i++) {
            System.out.print(result[i] + ", ");
        }
        return result; // 각 배열의 원소값 당 가격이 떨어지지 않은 시간
    }
}
