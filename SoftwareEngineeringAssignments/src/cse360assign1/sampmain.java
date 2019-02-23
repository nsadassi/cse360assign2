package cse360assign1;



public class sampmain {

	public static void main(String[] args) {
		
		OrderedIntList obj = new OrderedIntList();
		obj.insert(1);
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.print();
		obj.insert(-1);
		obj.insert(0);
		obj.insert(6);
		obj.insert(5);
		obj.insert(4);
		obj.print();
		obj.insert(3);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(-1);
		obj.insert(29);
		
		obj.print();
		
	}
}
