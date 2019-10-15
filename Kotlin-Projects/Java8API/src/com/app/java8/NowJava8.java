package com.app.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.app.java8.bean.Person;

public class NowJava8 {

	public static void main(String[] args) {

		List<String> lines = new ArrayList<>();
		lines.add("Spring");
		lines.add("Node");
		lines.add("Java");
		lines.add("Java");
		lines.add("C#");
		lines.add("Python");

		List<String> result = lines.stream().filter(line -> !"Java".equals(line)).collect(Collectors.toList());
		// result.forEach( System.out::println );

		// result.stream().filter(s -> s.contains("Sp")).forEach((s) -> {
		// System.out.println(s);
		// });
		// result.stream().filter(s -> s.equalsIgnoreCase("C#")).forEach((s) -> {
		// System.out.println(s);
		// });
		// result.stream().filter(s -> s.equalsIgnoreCase("Python") &&
		// !s.isEmpty()).forEach((s) -> {
		// System.out.println(s);
		// });
		// result.stream().filter(s -> s.equalsIgnoreCase("Java")).forEach((s) -> {
		// System.out.println(s);
		// });
		//
		// result.forEach((s) -> {
		// if (s.equals("Node"))
		// System.out.print(s + "\n");
		// });

//		Map<String, Long> map = lines.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting() ));
//		System.out.println(map);
//		// map.forEach((k, v) -> System.out.println(k + ", " + v) );
//
//		Stream<Set<String>> stream = Stream.of(map.keySet());
//		
//		List<Collection<String>> streamToList = stream.collect(Collectors.toList());
//		streamToList.forEach(System.out::println);
//		
//		List<String> listEq = map.keySet().stream().filter(x -> x.equals("Node")).collect(Collectors.toList());
//		System.out.println(listEq);
//		
//		List<Long> listNot = map.values().stream().filter(x -> x != 2).collect(Collectors.toList());
//		System.out.println(listNot);
		
//		Collection<Integer> collection = Arrays.asList(5,3,4,2,1);
//		Stream<Integer> streamOfCollection = collection.stream();
//		System.out.println(streamOfCollection.collect(Collectors.toSet()));
		
		
//		Stream<Integer> streamOfArray = Stream.of( 5,3,4,2,1 );
//		List<Integer> listInt = new ArrayList<>();
//		listInt.addAll( streamOfArray.collect( Collectors.toList()) );
//		System.out.println(listInt);
		
		Stream<Integer> streamBuilder = Stream.<Integer>builder().add(2).build();
		Stream<String> streamGenerated = Stream.generate(() -> "Pope").limit(10);
		//System.out.println(streamGenerated.collect(Collectors.toList()));
		
//		Stream<Integer> streamIterated = Stream.iterate(0, n -> n + 1).limit(20);
//		System.out.println(streamIterated.collect(Collectors.toList()));

		Person person1 = new Person("Pope", 18);
		Person person2 = new Person("John", 25);
		Person person3 = new Person("Joe", 28);
		Stream<Person> streamOfPerson= Stream.of( person1, person2, person3 );	
		
		List<Person> personList = new ArrayList<>();
		personList.addAll( streamOfPerson.collect( Collectors.toList()) ); //Stream to List
		
//		personList.forEach(person->{			
//			if(!person.getName().equalsIgnoreCase("Joe")) {
//				System.out.println( person );
//			}
//			
//		});
		//------------------------------------------------------------------------------------------------
//		Stream<Person> ps = personList.stream().map( p -> p.getName().substring(0, p.getName().length() ));
		List<String> ls1 = personList.stream().map( 
					person->person != null? person.getName().substring(0, 3) : ""
				).collect(Collectors.toList());
		
		//ls1.forEach( System.out::println );
		
		List<Person> ls2 = personList.stream().map( person->person != null? person : null).collect(Collectors.toList());
		//ls2.forEach( System.out::println );
		//-------------------------------------------------------------------------------------------------
		
//		List<String> list = Arrays.asList("abc3", "abc2", "abc1");
//		Stream<String> stm = list.stream().map( element -> element.substring(0, element.length() ));
//		System.out.println(stm.collect( Collectors.toList()));
		
//		Optional<List<Person>> anyElement = stream.findAny();
//		System.out.println(stream);
		
//		Optional<String> firstElement = stream.findFirst();
		
		
//		String[] arr = new String[]{"a", "b", "c"};
//		Stream<String> streamOfArrayFull = Arrays.stream(arr);
//		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
//		System.out.println(streamOfArrayPart);

	}

}