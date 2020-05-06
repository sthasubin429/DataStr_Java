public class stack1 {
    private Node top;
    private int size;

    public stack1(){
        this.size = 0;
        this.top = null;

    }

    public int getSize() {
        return this.size;
    }

    public Node getTop() {
        return this.top;
    }

    public void push(int data) {
        Node node = new Node(data);
        if (this.top == null) {
            this.top = node;
            this.size++;

        } else {
            node.previous = this.getTop();
            this.top = node;
            this.size++;

        }
    }

    public int pop() {
        int value = this.top.data;
        this.top = this.top.previous;
        this.size--;
        return value;
    }

    public Boolean isEmpty() {
        if (this.getSize() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public void printAll(){
        Node temp = this.top;
        while(temp != null){
            System.out.print(temp.data + ",");
            temp = temp.previous;
        }
        System.out.println("");
    }  
    public static void main(String[] args) {
        stack1 obj = new stack1();
        System.out.println(obj.isEmpty());  
        obj.push(1);
        obj.push(2);
        obj.printAll();
        obj.push(3);
        obj.push(4);
        obj.printAll();
        obj.pop();
        obj.push(5);
        obj.push(6);
        obj.printAll();
        obj.pop();
        obj.printAll();
        System.out.println(obj.isEmpty());
    }
    
}