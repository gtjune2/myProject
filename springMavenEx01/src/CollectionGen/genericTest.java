package CollectionGen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class genericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Properties
		 * key : Object
		 * Value : any type
		 */
		Properties properties = new Properties();
		
		properties.setProperty("cho", "조용근");
		properties.setProperty("kang", "강성조");
		properties.setProperty("lee", "이행엽");
		
		for (Object key : properties.keySet()) {
			System.out.println(properties.get(key));
		}
		
		/*
		 * Map
		 * key : any type?
		 * Value : any type
		 */
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("cho", "조용근");
		hashmap.put("kang", "강성조");
		hashmap.put("lee", "이행엽");
		
		for (String key : hashmap.keySet()) {
			System.out.println(hashmap.get(key));
		}
		
		System.out.println("-------------------------------");
		/*
		 * Set (집합)
		 * Value : 중복을 허용하지 않음
		 */
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("조용근");
		hashset.add("강성조");
		hashset.add("이행엽");
		
		for (String name : hashset) {		
			System.out.println(name);
		}
	}

}
