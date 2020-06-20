package linkedList;

public class LinkedList {
	static Node head=null;



	public Node insertAtTheEnd(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}

		return head;
	}

	public Node insertAtTheBeginning(int data){

		Node newNode=new Node(data);
		if(head!=null)
			newNode.next=head;

		head=newNode;


		return head;
	}
	public Node searchByValue(int val){
		if(head==null){
			return null;
		}
		else{			
			Node temp=head;			
			while(temp.next!=null){
				if(temp.data==val){
					return temp;
				}
				temp=temp.next;						
			}		
			if(temp.data==val){
				return temp;
			}
			else{
				return null;
			}
		}
	}

	public Node deleteByValue(int val){
		Node del=searchByValue(val);
		if(del!=null){
			if(del==head){
				head=head.next;
				return head;
			}
			else{
				Node temp=head;
				while(temp.next!=del){
					temp=temp.next;
				}
				temp.next=temp.next.next;
				return head;
			}
		}
		else{
			return null;
		}
	}

	public Node deleteByIndex(int val){
		int count=0;
		if(val<=sizeOfLinkedList()-1){
			if(val==0){
				head=head.next;
				return head;
			}
			else {
				Node temp=head;
				while(count!=val-1){
					temp=temp.next;
					count++;
				}
				temp.next=temp.next.next;
				return head;
			}
		}
		else{
			System.out.println("Linked list of that index is not present");
			return null;
		}
	}

	public int sizeOfLinkedList(){
		int count=0;
		if(head==null){
			return 0;
		}
		else{
			Node temp=head;			
			while(temp.next!=null){
				temp=temp.next;
				count ++;
			}
			return count+1;
		}
	}

	public Node getPreviousNode(Node node){
		if(node!=null){
			if(node==head){
				return null;
			}
			else{
				Node temp=head;
				while(temp.next!=node){
					temp=temp.next;
				}
				return temp;
			}
		}
		else{
			return null;
		}
	}


	public Node reverseUsingIteration(){

		if(head==null){
			return null;

		}
		else if(head.next==null){
			return head;

		}
		else{
			Node temp=head.next;
			//	Node temp2;
			while(temp.next!=null){


			}


		}
		return null;
	}

	public Node reverseUsingRecursion(){


		return null;
	}
	public Node sortTheLinkedList(){
		return null;
	}

	public void printAll(){
		/*Node temp= head;*/
		if (head==null){
			System.out.print("THERE IS NO ELEMENT PRESENT TO PRINT");

		}

		else {
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		System.out.println();


	}



	public static void main(String [] args){
		LinkedList ll=new LinkedList();
		ll.printAll();
		ll.insertAtTheEnd(10);
		ll.printAll();
		ll.insertAtTheEnd(11);
		ll.printAll();
		ll.insertAtTheEnd(12);
		ll.printAll();

		ll.insertAtTheBeginning(9);
		ll.insertAtTheBeginning(8);
		ll.insertAtTheBeginning(7);
		ll.insertAtTheBeginning(6);
		ll.printAll();


		Node searchedVal=ll.searchByValue(5);
		if(searchedVal==null){
			System.out.println("NULL VALUE");	
		}
		else{
			System.out.println(searchedVal.data);
		}


		Node searchedVal1=ll.searchByValue(6);
		if(searchedVal1==null){
			System.out.println("NULL VALUE");	
		}
		else{
			System.out.println(searchedVal1.data);
		}

		ll.printAll();

		ll.deleteByValue(9);

		ll.printAll();

		ll.deleteByValue(6);
		ll.printAll();

		ll.deleteByIndex(0);
		ll.printAll();

		ll.deleteByIndex(3);
		ll.printAll();


		System.out.println(ll.getPreviousNode(head));
		System.out.println(ll.getPreviousNode(head.next));
		System.out.println(ll.getPreviousNode(head.next.next));
	}

}
