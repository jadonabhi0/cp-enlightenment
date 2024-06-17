package PriorityQueue;

public class Client {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        int[] ar = new int[]{7,6,4,8,9,3,2,1,56};
        for (int i :ar) pq.insert(i);
        System.out.println(pq.peek());
//        while (!pq.isEmpty()) System.out.println(pq.poll());
    }

}
