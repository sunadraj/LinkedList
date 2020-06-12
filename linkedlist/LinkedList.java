package linkedlist;

public class LinkedList {

	private Node first=null;
	private int count =0;
	
	public void add(Object e) {
		if(first == null) {
			first =new Node(e,null);
			count++;
			return;
		}
		Node n=first;
		while(n.next != null) 
		{
			n=n.next;
		}
		n.next=new Node(e,null);
		count++;
		
		
	}
	public int size() {
		return count;
	}
	
	public Object get(int index) 
	{
		if(index>=size()) throw new IndexOutOfBoundsException();
		Node n=first;
		for(int i=1;i<index+1;i++) 
		{
			n=n.next;
		}
		return n.ele;
	}/*
	public String toString() {
		if(size()==0) return "[]";
		
		Node n=first;
		for(int i=0;i<size();i++) {
		System.out.println("arr["+i+"] ="+n.ele);
		n=n.next;
		}
		
		return "These are the elements present in current LinkedList";
	}
	*/
	public String toString() {
		if (size()==0) return "[]";
		String  s="["+first.ele;
		Node n=first;
		while(n.next!=null)
		{
			n=n.next;
			s+=","+n.ele;
		}
		return "Current LinkedList : "+s+"]";
	}
	public void add(int index,Object e) {
		if(index>size()) throw new IndexOutOfBoundsException("give the right index");
		
		Node temp=new Node(e,null);
		temp.ele=e;
		temp.next=null;
		
		if(index==0) {
		 first=new Node(e,first);
		 count++;
		 return;
		}
		Node n=first;
		
		
		for (int i=0;i<index-1;i++) {
			n=n.next;
	
		}
		
		count++;
		temp.next=n.next;
		n.next=temp;
		
		}
	public void clear() {
		count=0;
	}
	public void remove(int index)
	{
		if(index>size()) throw new IndexOutOfBoundsException("give the right index");
		
	}
		
	public static void main(String[] args) 
	{
		LinkedList arr=new LinkedList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr.size());
		System.out.println(arr.get(1));
		System.out.println(arr);
		System.out.println("add method with 2 args");
		arr.add(3,21);
		System.out.println(arr);
		arr.clear();
		System.out.println(arr);
		
	}

}
