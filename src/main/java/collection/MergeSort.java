package collection;

public class MergeSort {

	public static void main(String args[]) {
		SingleLinkedList list1 = new SingleLinkedList();
		list1.insert(21);
		list1.insert(10);
		list1.insert(15);
		list1.insert(20);
		list1.insert(1);
		list1.insert(8);
		list1.insert(00);

		MergeList mergeList = new MergeList();
		Node node = mergeList.mergeSort(list1.head, list1.size());
//		mergeList.display(node);

	}
	
}

class MergeList{
	
	public Node merge(Node lNode, Node rNode, Node node){
		if(lNode != null && rNode != null){
			if(lNode.data < rNode.data){
				node =  lNode;
				lNode =  lNode.next;
			}else{
				node =  rNode;
				rNode =  rNode.next;
			}
			node.next = null;
		}
		Node head =  node;
		
		while(lNode != null && rNode != null){
			if(lNode.data < rNode.data){
				Node tempNode = lNode;
				lNode =  lNode.next;
				tempNode.next =  null;
				node.next =  tempNode;
			}else{
				Node tempNode =  rNode;
				rNode =  rNode.next;
				tempNode.next =  null;
				node.next =  tempNode;
			}
			node =  node.next;
		}
		
		if(lNode == null){
			node.next = rNode;
		}else{
			node.next =  lNode;
		}
		return head;
	}
	
	public Node mergeSort(Node node, int length){
		if(length == 1){
			return node;
		}else{
			int mid = length/2;
			Node lNode, rNode;
			Node head = node;
			lNode =  node;
			for(int i=1; i<mid; i++){
				node =  node.next;
			}
			rNode = node.next;
			node.next =  null;
			Node tempNode =  rNode;
			for(int  i=mid; i<length-1; i++){
				tempNode =  tempNode.next;
			}
			tempNode.next =  null;
			lNode = mergeSort(lNode, mid);
			System.out.println ("\nleftNode");
			this.display(lNode);
			rNode = mergeSort(rNode, length - mid);
			System.out.println ("\nRightNode");
			this.display(rNode);
			Node tempHead = merge(lNode, rNode, head);
			System.out.println ("\nAfter Merge Node");
			this.display(tempHead);
			return tempHead;
		}
	}
	
	public void display(Node head){
		if(head == null){
			System.out.println("List is empty");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.println(" Data: " + temp.data);
				temp = temp.next;
			}
		}
	}
}
