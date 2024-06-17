package PriorityQueue;

import java.util.ArrayList;

public class PriorityQueue {

    private ArrayList<Integer> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        upHeapify(heap.size()-1);
    }

    private void upHeapify(int ci){ // child index
        int pi = (ci-1)/2; // calculate parent index
        if(heap.get(pi) > heap.get(ci)){
            swap(pi, ci);
            upHeapify(pi);
        }

    }

    public int poll(){
        int ans = heap.get(0);
        swap(0, heap.size()-1);
        heap.remove(heap.size()-1);
        downHeapify(0);
        return ans;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }

    private void downHeapify(int pi){
        int c1 = 2 * pi + 1;
        int c2 = 2 * pi + 2;

        if(c1 < heap.size() && heap.get(pi) > heap.get(c1)){
            swap(pi, c1);
            downHeapify(c1);
        }

        if(c2 < heap.size() && heap.get(pi) > heap.get(c2)){
            swap(pi, c2);
            downHeapify(c2);
        }
    }

    public int peek(){
        return heap.get(0);
    }
}
