package lessons;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// 다리를 지나는 트럭 x
public class Q42583 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight = {7,4,5,6};

        System.out.println("answer : " + solution(bridge_length, weight, truck_weight));

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int count = 0;
        int moveCount = 0;
        int currentWeight = 0;

        Queue<Integer> onBridge = new LinkedList<>();
        for(int i=0; i<truck_weights.length;) {
            System.out.print("트럭 : ");
            Iterator<Integer> t = onBridge.iterator();
            while(t.hasNext()) {
                int tt = t.next();
                System.out.print(tt+", ");
            }
            System.out.println(" / 시간 : " + count);

            count++;

            // 현재무게에 트럭 추가해도 다리 최대 무게 넘지 않는 경우
            if(currentWeight + truck_weights[i] <= weight) {
                onBridge.add(truck_weights[i]);
                currentWeight += truck_weights[i];
            }

            // 트럭 이동 수가 다리 길이만큼 왔을 경우
            System.out.println("moveCount : " + moveCount);
            if(moveCount == bridge_length) {
                System.out.println(onBridge.peek());
                currentWeight -= onBridge.poll();
                moveCount = 0;
                i++;
            } else {
                moveCount++;
                continue;
            }

            // 다리가 꽉 찬 경우
            if(onBridge.size() == bridge_length) {
                currentWeight -= onBridge.poll();
                moveCount = 0;
                i++;
            }

        }


        return count;
    }
}
