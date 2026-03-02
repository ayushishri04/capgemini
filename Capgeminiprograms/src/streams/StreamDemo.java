package streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(23, 34, 32,32, 56, 36, 64, 54, 53,54, 42, 43); //ctrl 1. ctrl+shift+0
		//one stream used only once 
		//so we use "list.stream" everytime
		Stream<Integer> stream = list.stream();
		boolean allMatch = stream.allMatch(x -> x>=40);
		System.out.println("all greater than 40: " + allMatch);

		//more than 75
		boolean anyMatch = list.stream().anyMatch(x -> x>=75);
		System.out.println("all greater than 75: " + anyMatch);
		System.out.println(list.stream().count());
		list.stream().distinct().forEach(System.out::println); //automatically delete duplicates//distinct elements
		System.out.println();
		list.stream().filter(x ->x>=40).forEach(System.out::println);//keep the element you want rest delete//it will not work with simple filter, we need to either sort or do anything
		
//		Stream<Integer> filter = list.stream().filter(x-> x>=40);
//		Optional<Integer> any = filter.findAny();
	//	Stream<Double> grades= list.stream().map(x->x/10.0);//function T->  you give me one type i will give you another 
//		System.out.println();
//		list.stream()
//		         .filter
	}

}
