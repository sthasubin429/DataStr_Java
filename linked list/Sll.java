public class Sll /*extends node*/{
  private Node head;
  private int size;

  /*public Sll(){
    super();
  }*/
  public Sll(){
    this.size = 0;
    this.head = null;
  }
  public void addAtBegining(int data){
    Node node = new Node(data);
    node.next = head;
    this.head = node;
    this.size++;
  }

  public void addAtNth(int data, int position){
    Node node = new Node(data);
    Node temp = this.head;
    for(int i = 0; i < position-1; i++){
      temp = temp.next;
    }

    node.next = temp.next;
    temp.next = node;
    this.size++;
  }
  //insert an end
   public void addNode(int data){
      Node node = new Node(data);
      Node temp = head;
	   //Node temp = node;         //****ERROR***** To traverse the list you have to start from head i.e. Node temp = head
	    if(this.head == null){
	      node.next = head;
	      this.head = node;
	      this.size++;
	    }
	    else{
	      while(temp.next != null){
	        temp = temp.next;
        }
	      temp.next = node;
	      node.next = null;
	      this.size++;
	    }
    }
    
    public void deleteAtFirst(){
      head = head.next;
      size--;
    }

    public void deleteAtNthPosition(int position){
      Node temp = head;
      for(int i =0; i<position-1;i++){
        temp = temp.next;
      }
      temp.next = temp.next.next;
      size--;
    }

    public void deleteAtEnd(){
      Node temp = head;
      while(temp.next.next != null){
        temp = temp.next;
      }
      temp.next = null;
      size--;
    }


  public void printAll(){
    Node temp = this.head;
    for(int i =0;i<this.size; i++){
      System.out.print(temp.data + ",");
      temp = temp.next;
    }
    System.out.println("");
  }
public static void main(String[] args) {
  Sll obj = new Sll();
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
  obj.addNode(12);
  obj.addAtNth(622, 2);
    obj.printAll();
  obj.printAll();
  obj.deleteAtNthPosition(5);
  obj.printAll();
  obj.deleteAtNthPosition(9);
  obj.printAll();
  obj.deleteAtEnd();
  obj.deleteAtEnd();
  obj.printAll();
  obj.deleteAtFirst();
  obj.deleteAtFirst();
    obj.printAll();
}
}