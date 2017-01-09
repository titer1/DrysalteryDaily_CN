
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.TreeMap; 
//to do optmize: *

class Student{
	public String id;
	public String name;
	public Student(String id ,String name){
			this.id = id;
			this.name = name;
	}
	
}

class ListTest{
	public List students;
	public ListTest(){
		this.students = new ArrayList();
	}
	//4.1add
	public void testAdd()
	{
		Student st1 = new Student("1","zhang");
		students.add(st1);
		
		Student st2 = new Student("2","li");
		students.add(0,st2);//set postion
		
		Student[] stuArr = {new Student("3","wang"),  new Student("4","ma")};
		students.addAll(    Arrays.asList(stuArr));//first use collection as parameter
		
		Student[] stuArr2 = {new Student("5","zhou"),  new Student("6","zhao")};
		students.addAll(2,Arrays.asList(stuArr2));
		
		//get API
		System.out.println("check add at 2:"+ ((Student)students.get(2)).id );
		System.out.println(" check name added at 3:"+ ((Student) students.get(3)).name  );
		
		
	}
	
	
	public void testGet()
	{
		System.out.println("testGet");
		int size = students.size();
		for(int i =0 ; i<size ;i++)
		{	
			Student st = (Student)students.get(i);
			System.out.println("student " + st.id +" :"+st.name );

		}
		
		
		
	}
	//4.2 del
	public void testRemove()
	{
		testForEach();
		Student st = (Student) students.get(4);
		
		System.out.println("now will remove 4");
		students.remove(st);
		testForEach();
		
	}
	//4.3 modify
	
	public void testModify()
	{
		System.out.println("testModify, change postion 4 with wu");
		students.set(4, new Student("3","wu"));
	}
	//4.4.1 iterate find
	
	
	public void testIterator()
	{
		Iterator it = students.iterator();
		System.out.println("by iterator:");
		while(it.hasNext()){
			Student st =(Student)it.next();
			System.out.println(" student"+ st.id + ":"+ st.name) ;
		}
		
	}
	
	public void testForEach()
	{
		System.out.println("testForEach");
		for(Object obj:students){
		Student st = (Student)obj;
		System.out.println("Student " + st.id  + ":"+ st.name);
		}

	}
	
	public static void entry()
	{
		
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testRemove();
		lt.testModify();
		lt.testForEach();
		lt.testIterator();
		
		/*
		 * */
	}
	//4.4 ? find
}

//SET API todo

class SetExample{
	//public static void main(String args[]){
	public static void Entry(){
		Set mySet1 = new HashSet();
		
		mySet1.add("A");
		mySet1.add("C");
		mySet1.add("A");
		mySet1.add("B");
		
		System.out.println("mySet1: "+ mySet1);
		
		//create a list and add some elemnts
		List list = new ArrayList();
		list.add("A");
		list.add("C");
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("C");
		
		//create set by using list here
		Set mySet2 = new HashSet(list);
		
		System.out.println("list: " + list);
		System.out.println("mySet2: " +mySet2);//container to string
		
		//compare the 2 sets
		System.out.println("mySet1 ?= mySet2 (1 is false by equal) " + mySet1.equals(mySet2));
		
		//now we will remove one element from mySet2
		mySet2.remove("A");
		System.out.println("mySet2: "+mySet2);
		
		//compare the 2 sets
				System.out.println("mySet1 ?= mySet2 (1 is false by equal) " + mySet1.equals(mySet2));
		
		//opt:检验集合包裹
				//mySet1.containsAll(list)
		System.out.println("list in mySet1? " + mySet1.containsAll(list));
		System.out.println("list in mySet2? " + mySet2.containsAll(list));
				
		
		//use Iterator in set
		
		Iterator iterator = mySet1.iterator();
		while( iterator.hasNext()){
			System.out.println("iterator loop:" + iterator.next());
		
		}
		
		//use for each in set
		
//		for(String str : mySet1){
//			System.out.println("for ecah loop: " + str);
//		}
		
		//clearing all elements
		mySet1.clear();
		System.out.println("mySet empty ? "+ mySet1.isEmpty());
		
		System.out.println("size mySet1 :" + mySet1.size());
		System.out.println("size mySet2 :" + mySet2.size());
		
		//creating an Array with the contents of the set
//		String[]   array = mySet2.toArray(new  String[ mySet2.size()]);
		
	}//main
	
//	{
	//fail to code: iterator by for-each and toArray use

//小结：就是集合就是可以主键不能重复，有序？
//Set里遍历元素只能用foreach 和 iterator 
//不能使用 get() 方法，因为它是无序的，不能想 List 一样查询具体索引的元素
	
}



//HASH API todo ,basic collector

class MapDemo4{
//referrence: https://examples.javacodegeeks.com/java-basics/java-map-example/	
	
	public static void entry()
	{
		
		testHashMap();
		testHashTable();//only can not put null key or null value in it
		
		//TreeMap ,similar to hashmap, but orderd by Red-black, not thread-safe
		testTreeMap();
		
		//solution ConcurrentHashMap
		//final
//		basic hashmap, for null check with hashtable , for order support with treeMap 
	}
	public static void testTreeMap()
	{
		TreeMap vehicles = new TreeMap();
		
		// Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		
		System.out.println("Total vehicles: " + vehicles.size());
		
		// Iterate over all vehicles, using the keySet method.
		for(Object key: vehicles.keySet())
			System.out.println(key + " - " + vehicles.get((String)key));
		System.out.println();
		
		System.out.println("Highest key: " + vehicles.lastKey());
		System.out.println("Lowest key: " + vehicles.firstKey());
		
		System.out.println("\nPrinting all values:");
		for(Object val: vehicles.values())
			System.out.println((Integer)val);
		System.out.println();
		
		// Clear all values.
		vehicles.clear();
		
		vehicles.put("Ford", null);//yes
		// Equals to zero.
		System.out.println("After clear operation, size: " + vehicles.size());
		
	}
	public static void testHashMap()
	{
		@SuppressWarnings("rawtypes")
		Map vehicles = new HashMap();
		
		//add
		vehicles.put("B",5);
		
		vehicles.put("M", 3);
		vehicles.put("Audi",4);
		vehicles.put("Ford",10);
		
		System.out.println("By for-each Total :"+ vehicles.size());
		
		//Type mismatch: cannot convert from element type Object to String
		//for( String key: vehicles.keySet())
		for(Object key:vehicles.keySet())
		{
			System.out.println(key + " - " + vehicles.get((String)key));
		}
		
		System.out.println();
		
		String searchKey = "Audi";
		if( vehicles.containsKey(searchKey))
		{
			System.out.println("FOund total" + vehicles.get(searchKey) + " " + searchKey);
			
			
		}
		
		vehicles.put("Audi",44);//Result ok, so change exsited value
		vehicles.put("Audi",null);//Result ok, so change exsited value

		//for-each twice
		for(Object key:vehicles.keySet())
		{
			System.out.println(key + " - " + vehicles.get((String)key));
		}
		
		vehicles.clear();
		System.out.println(""+vehicles.size());
	}
	//final put, remove,put,get api映射常见的 增删改查
	//can add null key or null value in it;
	
	
	public static void testHashTable()
	{
		
		
	}
}





public class demo_jdk_collection {
	
	
	public static void main(String[] args)
	{
		System.out.println("collection demo");
		//ListTest mLt = new ListTes
		
		//ListTest.entry();//test ArrayList ,anoter todo LinkedList
		
		//SetExample.Entry();
		
		MapDemo4.entry();
	}
}
//thanks F5
