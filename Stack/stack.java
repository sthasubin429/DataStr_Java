import java.util.ArrayList;
public class stack {
        ArrayList <Integer> stackData = new ArrayList<Integer>();
    public ArrayList getStack() {
        return this.stackData;
    }
    
    public void push(int data) {
        stackData.add(data);
    }

    public int pop() {
        int value = stackData.get(stackData.size()-1);
        stackData.remove(stackData.size() - 1);
        return value;
    }

    public Boolean isEmpty() {
        if (stackData.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        stack obj = new stack();
        System.out.println(obj.isEmpty());
        obj.push(1);
        System.out.println(obj.getStack());
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.getStack());
        obj.pop();
        System.out.println(obj.getStack());
        System.out.println(obj.isEmpty());
    }
}