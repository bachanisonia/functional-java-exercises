package com.learnjava.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencesDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Foo", 25);
		Person p2 = new Person("Bar", 45);
		
		//Supplier<Double> random = () -> Math.random();
		Supplier<Double> random = Math::random;
		
		Function<Person, String> getName = Person::getName;
		System.out.println(getName.apply(p1));
		
		BiPredicate<Person, Person> isEqual =  Person::equals;
		
		System.out.println(isEqual.test(p1, p2));

		List<String> list = new ArrayList<>();
		
		list.add("hello");
		list.add("world");
		list.add("hello");
		list.add("java");
		
		Function<ArrayList<String>, Integer> getCount = ArrayList::size;
		
		System.out.println(getCount.apply((ArrayList<String>) list));
		
		Function<List<String>, Set<String>> dedupe  
					= HashSet::new;
		
		System.out.println(dedupe.apply(list));

	}

}


class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
}