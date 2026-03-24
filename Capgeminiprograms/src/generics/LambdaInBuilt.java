//package generics;
//
//import java.util.List;
//import java.util.function.Consumer;
//
//public class LambdaInBuilt {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Consumer<String> consumer = (str) ->{
//			System.out.println("This is a consumer");
//			System.out.println("This is a consumer" + str);
//		};
//		consumer.accept("STRING FRAMEWORK");
//		List<Integer> list= List.of(4,5,6,32,54);
//		list.forEach((x) -> System.out.println("Consumer" + x));
////		list.forEach(System.out::println);
//		list.forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println("Consumer" +t);
//			}
//		});
//		list.forEach(System.out::println); 
//		
//		Function<String,Integer> fun2 = new Function<>() {
//			@Override
//			public Integer apply(String t) {
//				return null;
//			}
//		};
//		Function<String, Integer> fun1= (str) -> str.length();
//		Integer len = fun1.apply("Ayush");
//		System.out.println("length: " +len);
//		//write a lambda to get first 2 chars in upper case of the string using "Function" as
//		//functional interface
//		Function<String,String> fun3 = (str) -> str.substring(0,2).toUpperCase();
//		String nick = fun3.apply("utkarsh");
//		System.out.println(nick);
//		
//		//supplier interface
//		Supplier<Integer> supplier = new Supplier<>() {
//			@Override
//			public Integer get() {
//				return new Random().nextInt(400);
//			}
//		};
//		Random random = new Random(); //// have to create a random object when using method refernces
//		//line 43-47 i equivalent to line 51
//		supplier = () -> new Random().nextInt(400); 
//		for(int i = 1;i<=10;i++) {
//			System.out.println(supplier.get());
//		}
//		
//		
//		//using method references // have to create a random object
//		supplier = random::nextInt;
////		supplier.get =random.nextInt();
//		
//		Integer[] arr= {23,43,567,43,243,5,45,345,35,4};
//		List<Integer> list2 = new ArrayList<>();
//		list2.addAll(Arrays.asList(arr));
//	//	list2.removeIf(null); //removeIf cannot take null
//		//remove all elements >100
//		list2.removeIf(x -> x >100);
//		System.out.println(list2);
//	}
//	
//
//}
