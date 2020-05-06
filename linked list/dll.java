
public class dll {
    private Node head;
    private int size;

    public dll(){
        this.size = 0;
        this.head = null;

    }

    public void addAtBegining(int data){
        Node node = new Node(data);
        node.next = head;
        this.head = node;
        head.previous = null;
        node.previous = head;
        this.size++;
    }

    public void addAtNth(int data, int position){
        

        if(this.head ==null){
            addAtBegining(data);
        }
        else if(position > size){

        }
        else{
            Node node = new Node(data);
            Node temp = head;
           for(int i = 0; i < position-1; i++){
               temp = temp.next;
           }
           temp.next.previous = node;
           node.next = temp.next;
           node.previous = temp;
           temp.next = node;
           this.size++;
        }
    }

    public void addNode(int data){
        if(this.head == null){
            addAtBegining(data);    
        }        
        else{
            Node node = new Node(data);
            Node temp = head;
            while (temp.next !=null) {
                temp = temp.next;
            }
            temp.next = node;
            node.previous = temp;
            node.next = null;
            this.size++;

        }
    }

    public void deleteAtFirst() {
        head.next.previous = null;
        head = head.next;
        this.size--;
    }

    public void deleteAtNthPosition(int position) {
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next.next.previous = temp;
        temp.next = temp.next.next;
        size--;
    }

    public void deleteAtEnd() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        //last = last.previous.previous.next
        temp.next.previous = null;
        temp.next = null;
        size--;
    }
    
    public void printAll(){
        Node temp = this.head;
        for(int i =0;i<this.size; i++){
            System.out.print("Index "+i+":"+temp.data + ",");
            temp = temp.next;
        }
        System.out.println("");
    }
    

    public static void main(String[] args) {
        dll obj = new dll();
        obj.addAtBegining(5);
        obj.printAll();
        obj.addAtBegining(4);
        obj.printAll();
        obj.addAtBegining(3);
        obj.printAll();
        obj.addAtBegining(2);
        obj.printAll();
        obj.addAtBegining(1);
        obj.printAll();
        obj.addAtNth(87, 2);
        obj.printAll();
        obj.addNode(6);
        obj.printAll();
        obj.addNode(7);
        obj.printAll();
        obj.addNode(8);
        obj.printAll();
        obj.addNode(9);
        obj.addNode(10);
        obj.printAll();
        obj.addNode(11);
        obj.printAll();
        obj.deleteAtFirst();
        obj.printAll();
        obj.deleteAtNthPosition(3);
        obj.printAll();
        obj.deleteAtEnd();
        obj.printAll();
        obj.deleteAtEnd();
        obj.printAll();
    }
}