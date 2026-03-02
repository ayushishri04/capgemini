package collectionJava;
import java.util.ArrayList;
public class CollectionDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Guava");
		list.add("Orange");
		list.add("Pineapple");
		System.out.println("Element:" + list);
		list.remove("Guava");
		list.remove("Orange");
		System.out.println("Remove: " + list);
		list.size();
		System.out.println("Size: " + list.size());
		list.add("Mango");
		list.addAll(list);
		System.out.println("Add All: " + list);
		list.contains(list.get(2));
		System.out.println("Contains: " + list.contains("Banana"));
		list.clear();
		System.out.println("Clear: " + list);
		list.containsAll(list);
		System.out.println("Contains All: " + list.containsAll(list));
		list.add("Kiwi");
		list.add("Papaya");
		list.isEmpty();
		System.out.println("Is Empty: " + list.isEmpty());
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Watermelon");
		list1.add("Strawberry");
		list.retainAll(list1);
		list.retainAll(list);
		list.iterator();
		
	}
}
