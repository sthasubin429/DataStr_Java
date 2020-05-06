import java.util.ArrayList;

public class queue {
        ArrayList <Integer> queueData = new ArrayList<Integer>();
    public ArrayList getQueue() {
        return this.queueData;
    }
    
    public void enqueue(int data) {
        queueData.add(data);
    }

    public int dequeue() {
        int value = queueData.get(0);
        queueData.remove(0);
        return value;
    }

    public Boolean isEmpty() {
        if (queueData.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        queue obj = new queue();
        System.out.println(obj.isEmpty());
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.dequeue();
        System.out.println(obj.getQueue());
        System.out.println(obj.isEmpty());
    }
}